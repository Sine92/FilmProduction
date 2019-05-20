package za.ac.cput.projects.Repositories.CameraRepository;

import za.ac.cput.projects.Repositories.ArtRepository.IRepository;
import za.ac.cput.projects.Domain.Camera.DIT;

import java.util.Set;

public interface DITRepository extends IRepository <DIT, String> {

    Set<DIT> getAll();
}
