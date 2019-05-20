package za.ac.cput.projects.Services.CameraService;

import za.ac.cput.projects.Domain.Camera.CamAssistant;
import za.ac.cput.projects.Services.IService;

import java.util.Map;
import java.util.Set;

public interface CamAssService extends IService<CamAssistant, String> {
    Set<CamAssistant> getAll();


}
