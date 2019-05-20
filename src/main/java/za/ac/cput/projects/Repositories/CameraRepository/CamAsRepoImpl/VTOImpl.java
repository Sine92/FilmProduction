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
    public void delete(String s) {
         vtoSet.removeIf(t->t.getvTName().equals(s));

    }

    @Override
    public VTO update(VTO vto) {
         if(vtoSet.contains(vto))
         {
             for(VTO vto1: vtoSet)
             {
                 if(vto1.equals(vto))
                 {
                     return vto1;
                 }
             }
         }
        return null;
    }

    @Override
    public VTO read(String s) {
         if(vtoRepo.vtoSet.contains(s))
         {
             for(VTO vto1:vtoSet)
             {
                 if (vto1.equals(s))
                 {
                     return vto1;
                 }
             }
         }
        return null;
    }
}