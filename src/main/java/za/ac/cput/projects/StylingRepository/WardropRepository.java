package za.ac.cput.projects.StylingRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Styling.Wadrobe;

import java.util.Set;

public interface WardropRepository extends IRepository<Wadrobe, String> {

    Set<Wadrobe> getAll();
}
