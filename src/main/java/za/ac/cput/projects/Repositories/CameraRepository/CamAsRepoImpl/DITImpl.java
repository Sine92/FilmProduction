package za.ac.cput.projects.Repositories.CameraRepository.CamAsRepoImpl;

import za.ac.cput.projects.Domain.Camera.DIT;
import za.ac.cput.projects.Repositories.CameraRepository.DITRepository;

import java.util.HashSet;
import java.util.Set;

public class DITImpl implements DITRepository
{

    private static DITImpl ditImpl = null;
    private Set<DIT> ditSet;

    private DITImpl()
    {
        this.ditSet = new HashSet<>();
    }
    public static DITImpl getDit()
    {
        if(ditImpl== null)ditImpl = new DITImpl();
        return ditImpl;
    }
    private DIT findDit(String ditId)
    {
        return this.ditSet.stream()
                .filter(dit -> dit.getDitId().trim().equals(ditId))
                .findAny()
                .orElse(null);
    }


    @Override
    public Set<DIT> getAll() {
        return ditSet;
    }

    @Override
    public DIT create(DIT dit) {
        this.ditSet.add(dit);
        return dit;
    }

    @Override
    public void delete(String ditId) {
        DIT toDelete = findDit(ditId);
        if(toDelete!= null){
            this.ditSet.remove(toDelete);
        }


    }

    @Override
    public DIT update(DIT dit) {

        DIT toUpdate = findDit(dit.getDitId());
        if(toUpdate != null){
            this.ditSet.remove(toUpdate);
            return create(dit);
        }
       return null;
    }

    @Override
    public DIT read(String ditId) {

        DIT dit = findDit(ditId);
        return dit;
    }
}
