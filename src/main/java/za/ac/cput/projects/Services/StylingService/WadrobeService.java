package za.ac.cput.projects.Services.StylingService;

import za.ac.cput.projects.Domain.Styling.Wadrobe;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface WadrobeService extends IService<Wadrobe, String> {
     Set<Wadrobe> getAll();
}
