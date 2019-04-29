package za.ac.cput.projects.UnitRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Unit.UnitManager;

import java.util.Set;

public interface UnitManRepository extends IRepository<UnitManager, String> {
    Set<UnitManager> getAll();
}
