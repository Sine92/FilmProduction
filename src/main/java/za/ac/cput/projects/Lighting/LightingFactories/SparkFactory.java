package za.ac.cput.projects.Lighting.LightingFactories;

import za.ac.cput.projects.Lighting.Spark;

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
