package za.ac.cput.projects.Services.ProductionService;

import za.ac.cput.projects.Domain.Production.ProductionAssist;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface ProdAssService extends IService<ProductionAssist, String> {

    Set<ProductionAssist> getAll();
}
