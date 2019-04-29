package za.ac.cput.projects.LightingRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Lighting.Spark;

import java.util.Set;

public interface SparkRepository extends IRepository<Spark, String> {

    Set<Spark> getAll();
}
