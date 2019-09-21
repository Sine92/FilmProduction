package za.ac.cput.projects.Repositories.LightingRepository;

import za.ac.cput.projects.Repositories.IRepository;
import za.ac.cput.projects.Domain.Lighting.Spark;

import java.util.Set;

public interface SparkRepository extends IRepository<Spark, String> {

    Set<Spark> getAll();
}
