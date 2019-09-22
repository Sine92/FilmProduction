package za.ac.cput.projects.Repositories.CameraRepository.CamAsRepoImpl;

import za.ac.cput.projects.Domain.Camera.VTO;
import za.ac.cput.projects.Repositories.CameraRepository.VTORepository;

import java.util.HashSet;
import java.util.Set;

public class VTOImpl implements VTORepository {

    private static VTOImpl vtoRepo = null;
     private Set<VTO> vtoSet;

     private VTOImpl()
     {
         this.vtoSet = new HashSet<>();
     }
    public static VTOImpl getVtoRepo()
    {
        if( vtoRepo == null) vtoRepo = new VTOImpl();
        return vtoRepo;
    }
    private VTO findVTO(String vtId)
    {
        return  this.vtoSet.stream()
                .filter(vto -> vto.getVtId().trim().equals(vtId))
                .findAny()
                .orElse(null);
    }

    @Override
    public Set<VTO> getAll() {
        return vtoSet;
    }

    @Override
    public VTO create(VTO vto) {
         this.vtoSet.add(vto);
        return vto;
    }

    @Override
    public void delete(String vtId) {
      VTO toDelete = findVTO(vtId);
      if(toDelete!=null)
      {
        this.vtoSet.remove(toDelete);
      }

    }

    @Override
    public VTO update(VTO vto) {
         VTO toUpate = findVTO(vto.getVtId());
         if(toUpate!=null){
             this.vtoSet.remove(toUpate);
             return create(vto);
         }
        return null;
    }

    @Override
    public VTO read(String vtId) {
         VTO vto = findVTO(vtId);
         return vto;
    }
}
