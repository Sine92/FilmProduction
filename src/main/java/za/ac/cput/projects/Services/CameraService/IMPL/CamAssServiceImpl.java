package za.ac.cput.projects.Services.CameraService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Camera.CamAssistant;
import za.ac.cput.projects.Repositories.CameraRepository.CamAsRepoImpl.CamAssistantImp;
import za.ac.cput.projects.Services.CameraService.CamAssService;
import za.ac.cput.projects.Services.IService;

import java.util.Set;
@Service("CamAssServiceImpl")
public class CamAssServiceImpl implements CamAssService {


    @Autowired
    @Qualifier("CamAssServiceImpl")
    private  CamAssServiceImpl service = null;
    private CamAssistantImp camAssistantImp;
    @Override
    public Set<CamAssistant> getAll() {
        return camAssistantImp.getAll();
    }

    @Override
    public CamAssistant create(CamAssistant camAssistant) {
        return camAssistantImp.create(camAssistant);
    }

    @Override
    public CamAssistant update(CamAssistant camAssistant) {
        return camAssistantImp.update(camAssistant);
    }

    @Override
    public void delete(String camAssId) {
        camAssistantImp.delete(camAssId);

    }

    @Override
    public CamAssistant read(String s) {
        return camAssistantImp.read(s);
    }
}
