package za.ac.cput.projects.SoundRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Sound.SoundPerson;

import java.util.Set;

public interface SoundPersonRepository extends IRepository<SoundPerson, String> {

    Set<SoundPerson> getAll();

}
