package za.ac.cput.projects.Services.ProductionService;

import za.ac.cput.projects.Domain.Production.ProdManager;
import za.ac.cput.projects.Services.IService;

import java.util.Map;
import java.util.Set;

public interface ProdManagerService extends IService<ProdManager, String> {

    Set<ProdManager> getAll();

}
