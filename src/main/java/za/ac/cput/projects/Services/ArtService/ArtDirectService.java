package za.ac.cput.projects.Services.ArtService;

import za.ac.cput.projects.Domain.Art.ArtDirector;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface ArtDirectService extends IService<ArtDirector, String> {
    ArtDirector displayBy(String artDRole);
    Set<ArtDirector> getAll();
}
