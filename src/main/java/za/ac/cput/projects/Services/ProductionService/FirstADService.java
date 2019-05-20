package za.ac.cput.projects.Services.ProductionService;

import za.ac.cput.projects.Domain.Production.FirstAD;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface FirstADService extends IService<FirstAD, String> {

    Set<FirstAD> getAll();
}
