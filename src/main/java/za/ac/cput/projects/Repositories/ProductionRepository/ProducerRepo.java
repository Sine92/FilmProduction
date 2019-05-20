package za.ac.cput.projects.Repositories.ProductionRepository;

import za.ac.cput.projects.Repositories.ArtRepository.IRepository;
import za.ac.cput.projects.Domain.Production.Producer;

import java.util.Set;

public interface ProducerRepo extends IRepository<Producer, String> {
    Set<Producer> getAll();
}
