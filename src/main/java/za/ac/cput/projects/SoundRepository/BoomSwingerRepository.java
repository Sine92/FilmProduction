package za.ac.cput.projects.SoundRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Sound.BoomSwinger;

import java.util.Set;

public interface BoomSwingerRepository extends IRepository<BoomSwinger, String> {

    Set<BoomSwinger> getAll();
}
