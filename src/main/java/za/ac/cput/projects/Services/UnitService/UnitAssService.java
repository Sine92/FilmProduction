package za.ac.cput.projects.Services.UnitService;

import za.ac.cput.projects.Domain.Unit.UnitAssist;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface UnitAssService extends IService<UnitAssist,String> {
    Set<UnitAssist> getAll();
}
