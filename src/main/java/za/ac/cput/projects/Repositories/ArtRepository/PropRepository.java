package za.ac.cput.projects.Repositories.ArtRepository;



import za.ac.cput.projects.Domain.Art.ArtDirector;
import za.ac.cput.projects.Domain.Art.Props;
import za.ac.cput.projects.Repositories.IRepository;

import java.util.Set;

public interface PropRepository extends IRepository<Props , String> {
    Props displayBy(String ppRole);
    Set<Props> getAllPr();
}
