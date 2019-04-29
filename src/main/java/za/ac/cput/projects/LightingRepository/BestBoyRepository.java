package za.ac.cput.projects.LightingRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Lighting.BestBoy;

import java.util.Set;

public interface BestBoyRepository extends IRepository<BestBoy, String> {

    Set<BestBoy> getAll();
}
