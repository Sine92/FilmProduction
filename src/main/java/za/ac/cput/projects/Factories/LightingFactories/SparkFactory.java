package za.ac.cput.projects.Factories.LightingFactories;

import za.ac.cput.projects.Domain.Lighting.GeneratorOp;
import za.ac.cput.projects.Domain.Lighting.Spark;
import za.ac.cput.projects.Util.Helper;

public class SparkFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(Spark.class);
    public static Spark createSpark(String spnm, String spnum, double sprate,String spId)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return new Spark.Builder()
                .spId(id)
                .spName(spnm)
                .spNumber(spnum)
                .spRate(sprate)
                .build();
    }


}
