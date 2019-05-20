package za.ac.cput.projects.Repositories.ProductionRepository;

import za.ac.cput.projects.Repositories.ArtRepository.IRepository;
import za.ac.cput.projects.Domain.Production.ProdManager;

import java.util.Set;

public interface ProdManagerRepo extends IRepository<ProdManager,String> {
    Set<ProdManager> getAll();

}
