package za.ac.cput.projects.CameraRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Camera.FocusPuller;

import java.util.Set;

public interface FocusPullerRepository extends IRepository <FocusPuller, String> {

    Set<FocusPuller> getAll();
}
