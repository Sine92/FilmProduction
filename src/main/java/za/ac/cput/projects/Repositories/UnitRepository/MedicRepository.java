package za.ac.cput.projects.Repositories.UnitRepository;

import za.ac.cput.projects.Repositories.IRepository;
import za.ac.cput.projects.Domain.Unit.Medic;

import java.util.Set;

public interface MedicRepository extends IRepository<Medic, String> {

    Set<Medic> getAll();
}
