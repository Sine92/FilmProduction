package za.ac.cput.projects.Repositories.StylingRepository;

import za.ac.cput.projects.Repositories.IRepository;
import za.ac.cput.projects.Domain.Styling.Wadrobe;

import java.util.Set;

public interface WardropRepository extends IRepository<Wadrobe, String> {

    Set<Wadrobe> getAll();
}
