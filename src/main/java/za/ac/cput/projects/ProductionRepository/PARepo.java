package za.ac.cput.projects.ProductionRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Production.ProductionAssist;

import java.util.Set;

public interface PARepo extends IRepository<ProductionAssist, String> {

    Set<ProductionAssist> getAll();
}
