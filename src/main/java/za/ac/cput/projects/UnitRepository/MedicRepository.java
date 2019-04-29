package za.ac.cput.projects.UnitRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Unit.Medic;

import java.util.Set;

public interface MedicRepository extends IRepository<Medic, String> {

    Set<Medic> getAll();
}
