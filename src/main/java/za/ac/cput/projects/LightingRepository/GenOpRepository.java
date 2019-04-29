package za.ac.cput.projects.LightingRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Lighting.GeneratorOp;

import java.util.Set;

public interface GenOpRepository extends IRepository<GeneratorOp, String> {

    Set<GeneratorOp> getAll();
}
