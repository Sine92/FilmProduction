package za.ac.cput.projects.Repositories.ArtRepository;

import za.ac.cput.projects.Domain.Art.ArtDirector;
import za.ac.cput.projects.Repositories.IRepository;

import java.util.Set;

public interface ArtDirectorRepository extends IRepository<ArtDirector, String> {

    Set<ArtDirector> getAll();


}
