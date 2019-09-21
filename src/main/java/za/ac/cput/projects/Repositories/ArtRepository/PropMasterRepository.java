package za.ac.cput.projects.Repositories.ArtRepository;

import za.ac.cput.projects.Domain.Art.PropMaster;
import za.ac.cput.projects.Repositories.IRepository;

import java.util.Set;


public interface PropMasterRepository extends IRepository<PropMaster, String> {

    Set<PropMaster> getAll();
}
