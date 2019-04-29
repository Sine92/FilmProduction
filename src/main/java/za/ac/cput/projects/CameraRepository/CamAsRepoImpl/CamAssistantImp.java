package za.ac.cput.projects.CameraRepository.CamAsRepoImpl;

import za.ac.cput.projects.Camera.CamAssistant;
import za.ac.cput.projects.CameraRepository.CamAsRepository;

import java.util.Set;

public class CamAssistantImp implements CamAsRepository {

    private static CamAssistantImp camRepo= null;

    private Set<CamAssistant> camAssistantSet;

    public static CamAssistantImp getCamRepo()
    {
        if(camRepo == null) camRepo = new CamAssistantImp();
        return camRepo;

    }


    public Set<CamAssistant> getAll()
    {
        return this.camAssistantSet;
    }


    @Override
    public CamAssistant create(CamAssistant camAssistant) {
        this.camAssistantSet.add(camAssistant);
        return camAssistant;
    }

    @Override
    public void delete(String camNameId) {

        camAssistantSet.removeIf(t->t.getCamAssistName().equals(camNameId));

    }

    @Override
    public CamAssistant update(CamAssistant camAssistant) {
       if(camAssistantSet.contains(camAssistant))
       {
           for(CamAssistant camAssistant1: camAssistantSet)
           {
               if(camAssistant1.equals(camAssistant))
               {
                   return camAssistant1;
               }
           }
       }
       return null;
    }

    @Override
    public CamAssistant read(CamAssistant camAssistant) {

        if(camRepo.camAssistantSet.contains(camAssistant))
        {
            for(CamAssistant camAssistant1:camAssistantSet)
            {
                if(camAssistant1.equals(camAssistant))
                {
                    return camAssistant1;
                }
            }
        }

        return null;
    }
}
