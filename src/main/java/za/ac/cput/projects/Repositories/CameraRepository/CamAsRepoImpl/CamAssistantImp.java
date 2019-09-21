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
    private CamAssistant findCamAssistant()
    {

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



    }

    @Override
    public CamAssistant update(CamAssistant camAssistant) {

    }

    @Override
    public CamAssistant read(String camAssistant) {

    }
}
