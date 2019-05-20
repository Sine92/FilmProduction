package za.ac.cput.projects.Repositories.CameraRepository;

import za.ac.cput.projects.Repositories.ArtRepository.IRepository;
import za.ac.cput.projects.Domain.Camera.FocusPuller;

import java.util.Set;

public interface FocusPullerRepository extends IRepository <FocusPuller, String> {

    Set<FocusPuller> getAll();
}
