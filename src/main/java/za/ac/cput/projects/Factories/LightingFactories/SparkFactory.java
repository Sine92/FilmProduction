package za.ac.cput.projects.Factories.LightingFactories;

import za.ac.cput.projects.Domain.Lighting.Spark;

public class SparkFactory {

    public static Spark createSpark(String spnm, String spnum, double sprate)
    {
        return new Spark.Builder()
                .spName(spnm)
                .spNumber(spnum)
                .spRate(sprate)
                .build();
    }


}
