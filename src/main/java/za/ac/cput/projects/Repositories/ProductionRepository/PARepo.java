package za.ac.cput.projects.Repositories.ProductionRepository;

import za.ac.cput.projects.Repositories.ArtRepository.IRepository;
import za.ac.cput.projects.Domain.Production.ProductionAssist;

import java.util.Set;

public interface PARepo extends IRepository<ProductionAssist, String> {

    Set<ProductionAssist> getAll();
}
