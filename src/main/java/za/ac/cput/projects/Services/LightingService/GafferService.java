package za.ac.cput.projects.Services.LightingService;

import za.ac.cput.projects.Domain.Lighting.Gaffer;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface GafferService extends IService<Gaffer,String> {
    Set<Gaffer> getAll();
}
