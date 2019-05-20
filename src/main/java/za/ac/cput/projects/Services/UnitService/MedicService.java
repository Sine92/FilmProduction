package za.ac.cput.projects.Services.UnitService;

import za.ac.cput.projects.Domain.Unit.Medic;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface MedicService extends IService<Medic, String> {

    Set<Medic> getAll();
}
