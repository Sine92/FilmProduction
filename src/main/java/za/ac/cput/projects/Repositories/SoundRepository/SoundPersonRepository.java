package za.ac.cput.projects.Repositories.SoundRepository;

import za.ac.cput.projects.Repositories.ArtRepository.IRepository;
import za.ac.cput.projects.Domain.Sound.SoundPerson;

import java.util.Set;

public interface SoundPersonRepository extends IRepository<SoundPerson, String> {

    Set<SoundPerson> getAll();

}
