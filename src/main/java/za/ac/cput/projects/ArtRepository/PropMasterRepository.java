package za.ac.cput.projects.ArtRepository;

import za.ac.cput.projects.Art.PropMaster;

import java.util.Set;


public interface PropMasterRepository extends IRepository<PropMaster, String> {

    Set<PropMaster> getAll();
}
