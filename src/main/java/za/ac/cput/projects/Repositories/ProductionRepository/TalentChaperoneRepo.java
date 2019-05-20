package za.ac.cput.projects.Repositories.ProductionRepository;

import za.ac.cput.projects.Repositories.ArtRepository.IRepository;
import za.ac.cput.projects.Domain.Production.TalentChaperone;

import java.util.Set;

public interface TalentChaperoneRepo extends IRepository<TalentChaperone, String> {

    Set<TalentChaperone> getAll();
}
