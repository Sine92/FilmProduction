package za.ac.cput.projects.Repositories.ArtRepository.ArtImplRepository;

import za.ac.cput.projects.Domain.Art.ArtDirector;
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
    private PropMaster findPropMaster(String propMasterId){
       return  this.propMasterSet.stream()
               .filter(propMaster -> propMaster.getPropMasterId().trim().equals(propMasterId))
               .findAny()
               .orElse(null);

      }

    public PropMaster create(PropMaster propMaster)
    {
        this.propMasterSet.add(propMaster);
        return propMaster;
    }
    public PropMaster read(String propMasterId)
    {
     PropMaster propMaster = findPropMaster(propMasterId);
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

    public void delete(String propMasterId)
    {

     PropMaster toDelete = findPropMaster(propMasterId);
      if(toDelete!=null){
          this.propMasterSet.remove(toDelete);
      }

    }
    @Override
    public PropMaster displayBy(String pmRole)
    {
        return this.propMasterSet.stream()
                .filter(propMaster -> propMaster.getPmRole().equalsIgnoreCase(pmRole))
                .findAny().orElse(null);
    }

    public Set<PropMaster> getAll()
    {
        return this.propMasterSet;
    }

}
