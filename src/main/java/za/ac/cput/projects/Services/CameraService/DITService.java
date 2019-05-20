package za.ac.cput.projects.Services.CameraService;

import za.ac.cput.projects.Domain.Camera.DIT;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface DITService extends IService<DIT,String> {
    Set<DIT> getAll();
}
