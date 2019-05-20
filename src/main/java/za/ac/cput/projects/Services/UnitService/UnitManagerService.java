package za.ac.cput.projects.Services.UnitService;

import za.ac.cput.projects.Domain.Unit.UnitManager;
import za.ac.cput.projects.Services.IService;

import java.util.Map;
import java.util.Set;

public interface UnitManagerService extends IService<UnitManager, String> {

    Set<UnitManager> getAll();
}
