package za.ac.cput.projects.Repositories.GripsRepository;

import za.ac.cput.projects.Repositories.ArtRepository.IRepository;
import za.ac.cput.projects.Domain.Grips.KeyGrip;

import java.util.Set;

public interface KeyGripRepository extends IRepository<KeyGrip,String> {

    Set<KeyGrip> getAll();
}
