package za.ac.cput.projects.Repositories.CameraRepository.CamAsRepoImpl;

import za.ac.cput.projects.Domain.Camera.CamAssistant;
import za.ac.cput.projects.Repositories.CameraRepository.CamAsRepository;

import java.util.Set;

public class CamAssistantImp implements CamAsRepository {

    private static CamAssistantImp camRepo= null;

    private Set<CamAssistant> camAssistantSet;

    public static CamAssistantImp getCamRepo()
    {
        if(camRepo == null) camRepo = new CamAssistantImp();
        return camRepo;

    }
    private CamAssistant findCamAssistant(String camAssId)
    {
         return this.camAssistantSet.stream()
                 .filter(camAssistant -> camAssistant.getCamAssId().trim().equals(camAssId))
                 .findAny()
                 .orElse(null);
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
    public void delete(String camAssId) {

        CamAssistant toDelete = findCamAssistant(camAssId);
        if(toDelete != null){
            this.camAssistantSet.remove(toDelete);
        }



    }

    @Override
    public CamAssistant update(CamAssistant camAssistant) {
        CamAssistant toUpdate = findCamAssistant(camAssistant.getCamAssId());
        if(toUpdate!= null){
            this.camAssistantSet.remove(toUpdate);
            return create(camAssistant);
        }
       return  null;
    }

    @Override
    public CamAssistant read(String camAssId) {

        CamAssistant camAssistant = findCamAssistant(camAssId);
        return camAssistant;

    }
}
