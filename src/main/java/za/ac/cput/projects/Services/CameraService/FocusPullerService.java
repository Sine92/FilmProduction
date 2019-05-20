package za.ac.cput.projects.Services.CameraService;

import za.ac.cput.projects.Domain.Camera.FocusPuller;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface FocusPullerService extends IService<FocusPuller,String> {
    Set<FocusPuller> getAll();
}
