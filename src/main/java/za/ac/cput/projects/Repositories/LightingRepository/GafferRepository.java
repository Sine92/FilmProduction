package za.ac.cput.projects.Repositories.LightingRepository;

import za.ac.cput.projects.Repositories.IRepository;
import za.ac.cput.projects.Domain.Lighting.Gaffer;

import java.util.Set;

public interface GafferRepository extends IRepository<Gaffer, String> {
    Set<Gaffer> getAll();
}
