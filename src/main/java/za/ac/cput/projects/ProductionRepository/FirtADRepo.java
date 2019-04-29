package za.ac.cput.projects.ProductionRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Production.FirstAD;

import java.util.Set;

public interface FirtADRepo extends IRepository<FirstAD, String> {

    Set<FirstAD> getAll();
}
