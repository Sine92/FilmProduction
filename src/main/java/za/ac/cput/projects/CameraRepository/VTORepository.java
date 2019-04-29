package za.ac.cput.projects.CameraRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Camera.VTO;

import java.util.Set;

public interface VTORepository extends IRepository <VTO, String> {

    Set<VTO> getAll();
}
