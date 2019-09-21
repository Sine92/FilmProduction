package za.ac.cput.projects.Repositories.CameraRepository;

import za.ac.cput.projects.Repositories.IRepository;
import za.ac.cput.projects.Domain.Camera.VTO;

import java.util.Set;

public interface VTORepository extends IRepository <VTO, String> {

    Set<VTO> getAll();
}
