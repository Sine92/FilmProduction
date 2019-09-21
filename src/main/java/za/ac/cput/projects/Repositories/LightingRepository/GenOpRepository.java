package za.ac.cput.projects.Repositories.LightingRepository;

import za.ac.cput.projects.Repositories.IRepository;
import za.ac.cput.projects.Domain.Lighting.GeneratorOp;

import java.util.Set;

public interface GenOpRepository extends IRepository<GeneratorOp, String> {

    Set<GeneratorOp> getAll();
}
