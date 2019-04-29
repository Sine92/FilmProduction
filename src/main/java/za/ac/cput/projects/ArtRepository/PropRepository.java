package za.ac.cput.projects.ArtRepository;



import za.ac.cput.projects.Art.Props;

import java.util.Set;

public interface PropRepository extends IRepository<Props , String> {

    Set<Props> getAllPr();
}
