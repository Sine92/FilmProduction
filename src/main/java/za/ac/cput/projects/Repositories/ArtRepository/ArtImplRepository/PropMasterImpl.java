package za.ac.cput.projects.Repositories.ArtRepository.ArtImplRepository;

import za.ac.cput.projects.Domain.Art.PropMaster;
import za.ac.cput.projects.Repositories.ArtRepository.PropMasterRepository;

import java.util.HashSet;
import java.util.Set;

public class PropMasterImpl implements PropMasterRepository {

    private  static PropMasterImpl propMasterRepo = null;
    private Set<PropMaster> propMasterSet;

    private PropMasterImpl()
    {
     this.propMasterSet = new HashSet<>();
    }

    public static PropMasterImpl getPropMaster()
    {
        if (propMasterRepo == null) propMasterRepo = new PropMasterImpl();
        return propMasterRepo;
    }

    public PropMaster create(PropMaster propMaster)
    {
        this.propMasterSet.add(propMaster);
        return propMaster;
    }
    public PropMaster read(String propMaster)
    {
        if(propMasterRepo.propMasterSet.contains(propMaster)){
            for(PropMaster propMaster1: propMasterSet)
            {
              if(  propMaster1.equals(propMaster))
                        return propMaster1;
            }
    }
        return null;
    }

    public PropMaster update(PropMaster propMaster)
    {
        if(propMasterSet.contains(propMaster))
        {
            for(PropMaster propMaster1: propMasterSet)
            {
                if(propMaster1.equals(propMaster))
                    return propMaster1;
            }
        }
        return propMaster;
    }
    public void delete(String propId)
    {

      propMasterSet.removeIf(t ->t.getPropMasterName().equals(propId));

    }
    public Set<PropMaster> getAll()
    {
        return this.propMasterSet;
    }

}
