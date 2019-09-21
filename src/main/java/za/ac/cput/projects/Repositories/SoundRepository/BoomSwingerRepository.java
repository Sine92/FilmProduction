package za.ac.cput.projects.Repositories.SoundRepository;

import za.ac.cput.projects.Repositories.IRepository;
import za.ac.cput.projects.Domain.Sound.BoomSwinger;

import java.util.Set;

public interface BoomSwingerRepository extends IRepository<BoomSwinger, String> {

    Set<BoomSwinger> getAll();
}
