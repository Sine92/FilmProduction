package za.ac.cput.projects.Services.LightingService;

import za.ac.cput.projects.Domain.Lighting.Spark;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface SparkService extends IService<Spark, String> {
    Set<Spark> getAll();
}
