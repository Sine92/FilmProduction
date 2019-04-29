package za.ac.cput.projects.ProductionRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Production.TalentChaperone;

import java.util.Set;

public interface TalentChaperoneRepo extends IRepository<TalentChaperone, String> {

    Set<TalentChaperone> getAll();
}
