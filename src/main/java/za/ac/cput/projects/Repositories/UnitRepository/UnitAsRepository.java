package za.ac.cput.projects.Repositories.UnitRepository;

import za.ac.cput.projects.Repositories.ArtRepository.IRepository;
import za.ac.cput.projects.Domain.Unit.UnitAssist;

import java.util.Set;

public interface UnitAsRepository extends IRepository<UnitAssist, String> {
    Set<UnitAssist> getAll();
}
