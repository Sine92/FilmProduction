package za.ac.cput.projects.GripsRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Grips.KeyGrip;

import java.util.Set;

public interface KeyGripRepository extends IRepository<KeyGrip,String> {

    Set<KeyGrip> getAll();
}
