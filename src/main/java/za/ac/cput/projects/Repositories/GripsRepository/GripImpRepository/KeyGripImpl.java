package za.ac.cput.projects.Repositories.GripsRepository.GripImpRepository;

import za.ac.cput.projects.Domain.Grips.KeyGrip;
import za.ac.cput.projects.Repositories.GripsRepository.KeyGripRepository;

import java.util.HashSet;
import java.util.Set;

public class KeyGripImpl implements KeyGripRepository {

    private static KeyGripImpl keyGripImpl = null;
    private Set<KeyGrip> keyGripSet;

    private KeyGripImpl()
    {
        this.keyGripSet = new HashSet<>();
    }
    public static KeyGripImpl getKeyGrip()
    {
        if(keyGripImpl == null) keyGripImpl = new KeyGripImpl();
        return keyGripImpl;
    }

    private KeyGrip findKeyGrip(String kgId)
    {
        return this.keyGripSet.stream()
                .filter(keyGrip -> keyGrip.getKgId().trim().equals(kgId))
                .findAny()
                .orElse(null);
    }
    @Override
    public Set<KeyGrip> getAll() {
        return keyGripSet;
    }

    @Override
    public KeyGrip create(KeyGrip keyGrip) {
        this.keyGripSet.add(keyGrip);
        return keyGrip;
    }

    @Override
    public void delete(String kdId) {
        KeyGrip toDelete = findKeyGrip(kdId);
        if(toDelete!=null){
            this.keyGripSet.remove(toDelete);
        }
    }

    @Override
    public KeyGrip update(KeyGrip keyGrip) {
        KeyGrip toUpdate = findKeyGrip(keyGrip.getKgId());
        if(toUpdate!=null){
            this.keyGripSet.remove(toUpdate);
            return create(keyGrip);
        }
        return null;
    }

    @Override
    public KeyGrip read(String kdId) {
        KeyGrip keyGrip = findKeyGrip(kdId);
        return keyGrip;
    }
}
