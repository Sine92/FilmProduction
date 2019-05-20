package za.ac.cput.projects.Repositories.ProductionRepository;

import za.ac.cput.projects.Repositories.ArtRepository.IRepository;
import za.ac.cput.projects.Domain.Production.FirstAD;

import java.util.Set;

public interface FirtADRepo extends IRepository<FirstAD, String> {

    Set<FirstAD> getAll();
}
