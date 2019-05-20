package za.ac.cput.projects.Repositories.UnitRepository;

import za.ac.cput.projects.Repositories.ArtRepository.IRepository;
import za.ac.cput.projects.Domain.Unit.UnitManager;

import java.util.Map;
import java.util.Set;

public interface UnitManRepository extends IRepository<UnitManager, String> {
    Set<UnitManager> getAll();
}
