package za.ac.cput.projects.Services.LightingService;

import za.ac.cput.projects.Domain.Lighting.BestBoy;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface BestBoyService extends IService<BestBoy, String> {

    Set<BestBoy> getAll();
}
