package za.ac.cput.projects.CameraRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Camera.DIT;

import java.util.Set;

public interface DITRepository extends IRepository <DIT, String> {

    Set<DIT> getAll();
}
