package za.ac.cput.projects.ArtRepository;

import za.ac.cput.projects.Art.ArtDirector;

import java.util.Set;

public interface ArtDirectorRepository extends  IRepository <ArtDirector, String>{

    Set<ArtDirector> getAll();


}
