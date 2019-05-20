package za.ac.cput.projects.Repositories.LightingRepository;

import za.ac.cput.projects.Repositories.ArtRepository.IRepository;
import za.ac.cput.projects.Domain.Lighting.BestBoy;

import java.util.Set;

public interface BestBoyRepository extends IRepository<BestBoy, String> {

    Set<BestBoy> getAll();
}
