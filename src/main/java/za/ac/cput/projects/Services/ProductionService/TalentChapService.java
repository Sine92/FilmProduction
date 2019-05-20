package za.ac.cput.projects.Services.ProductionService;

import za.ac.cput.projects.Domain.Production.TalentChaperone;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface TalentChapService extends IService <TalentChaperone, String> {
    Set<TalentChaperone> getAll();
}
