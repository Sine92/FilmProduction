package za.ac.cput.projects.Services.ProductionService;

import za.ac.cput.projects.Domain.Production.Producer;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface ProducerService extends IService<Producer, String> {
    Set<Producer> getAll();
}
