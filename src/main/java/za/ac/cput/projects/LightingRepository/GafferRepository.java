package za.ac.cput.projects.LightingRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Lighting.Gaffer;

import java.util.Set;

public interface GafferRepository extends IRepository<Gaffer, String> {
    Set<Gaffer> getAll();
}
