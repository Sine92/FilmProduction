package za.ac.cput.projects.Services.CameraService;

import za.ac.cput.projects.Domain.Camera.VTO;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface VTOService extends IService<VTO, String> {

    Set<VTO> getAll();
}
