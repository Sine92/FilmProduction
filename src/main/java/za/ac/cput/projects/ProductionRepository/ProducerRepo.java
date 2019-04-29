package za.ac.cput.projects.ProductionRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Production.Producer;

import java.util.Set;

public interface ProducerRepo extends IRepository<Producer, String> {
    Set<Producer> getAll();
}
