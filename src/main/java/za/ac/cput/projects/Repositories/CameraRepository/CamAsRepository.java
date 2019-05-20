package za.ac.cput.projects.Repositories.CameraRepository;

import za.ac.cput.projects.Repositories.ArtRepository.IRepository;
import za.ac.cput.projects.Domain.Camera.CamAssistant;

import java.util.Set;

public interface CamAsRepository extends IRepository<CamAssistant, String> {

    Set<CamAssistant> getAll();


}
