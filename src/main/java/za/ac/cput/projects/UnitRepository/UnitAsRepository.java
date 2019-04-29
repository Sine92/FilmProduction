package za.ac.cput.projects.UnitRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Unit.UnitAssist;

import java.util.Set;

public interface UnitAsRepository extends IRepository<UnitAssist, String> {
    Set<UnitAssist> getAll();
}
