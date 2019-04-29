package za.ac.cput.projects.ProductionRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Production.ProdManager;

import java.util.Set;

public interface ProdManagerRepo extends IRepository<ProdManager,String> {
    Set<ProdManager> getAll();

}
