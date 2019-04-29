package za.ac.cput.projects.GripsRepository.GripImpRepository;

import za.ac.cput.projects.Grips.KeyGrip;
import za.ac.cput.projects.GripsRepository.KeyGripRepository;

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
    public void delete(String s) {
        keyGripSet.removeIf(t->t.getKgName().equals(s));

    }

    @Override
    public KeyGrip update(KeyGrip keyGrip) {
        if(keyGripSet.contains(keyGrip))
        {
            for(KeyGrip keyGrip1: keyGripSet)
            {
                if(keyGrip1.equals(keyGrip))
                {
                    return keyGrip1;
                }
            }
        }
        return null;
    }

    @Override
    public KeyGrip read(KeyGrip keyGrip) {
        if(keyGripImpl.keyGripSet.contains(keyGrip))
        {
            for(KeyGrip keyGrip1:keyGripSet)
            {
                if(keyGrip1.equals(keyGrip))
                {
                    return keyGrip1;
                }
            }
        }
        return null;
    }
}
