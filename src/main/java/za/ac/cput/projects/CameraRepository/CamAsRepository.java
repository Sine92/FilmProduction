package za.ac.cput.projects.CameraRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Camera.CamAssistant;

import java.util.Set;

public interface CamAsRepository extends IRepository<CamAssistant, String> {

    Set<CamAssistant> getAll();


}
