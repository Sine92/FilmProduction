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
    private PropMaster findPropMaster(String proId){
       return  this.propMasterSet.stream()
               .filter(propMaster -> propMaster.getPropMasterId().trim().equals(proId))
               .findAny()
               .orElse(null);

      }

    public PropMaster create(PropMaster propMaster)
    {
        this.propMasterSet.add(propMaster);
        return propMaster;
    }
    public PropMaster read(String propId)
    {
     PropMaster propMaster = findPropMaster(propId);
     return propMaster;

    }

    public PropMaster update(PropMaster propMaster) {

        PropMaster toUpate = findPropMaster(propMaster.getPropMasterId());
        if(toUpate!= null){
            this.propMasterSet.remove(toUpate);
            return create(propMaster);
        }
       return  null;
    }

    public void delete(String propId)
    {

     PropMaster toDelete = findPropMaster(propId);
      if(toDelete!=null){
          this.propMasterSet.remove(toDelete);
      }

    }
    public Set<PropMaster> getAll()
    {
        return this.propMasterSet;
    }

}
