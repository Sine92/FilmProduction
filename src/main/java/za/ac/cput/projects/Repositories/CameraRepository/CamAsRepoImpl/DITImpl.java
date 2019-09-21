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
    public void delete(String s) {
        ditSet.removeIf(t->t.getDitName().equals(s));

    }

    @Override
    public DIT update(DIT dit) {

        if(ditSet.contains(dit))
        {
            for(DIT dit1:ditSet)
            {
                if(dit1.equals(dit))
                {
                    return dit1;
                }
            }
        }
        return null;
    }

    @Override
    public DIT read(String s) {
        if(ditImpl.ditSet.contains(s))
        {
            for(DIT dit1:ditSet)
            {
                if(dit1.equals(s))
                {
                    return dit1;
                }
            }
        }
        return null;
    }
}
