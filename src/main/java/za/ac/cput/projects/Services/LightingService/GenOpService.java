package za.ac.cput.projects.Services.LightingService;

import za.ac.cput.projects.Domain.Lighting.GeneratorOp;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface GenOpService extends IService<GeneratorOp, String> {
    Set<GeneratorOp> getAll();
}
