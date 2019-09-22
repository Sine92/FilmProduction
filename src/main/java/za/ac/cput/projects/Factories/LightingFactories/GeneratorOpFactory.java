package za.ac.cput.projects.Factories.LightingFactories;

import za.ac.cput.projects.Domain.Lighting.Gaffer;
import za.ac.cput.projects.Domain.Lighting.GeneratorOp;
import za.ac.cput.projects.Util.Helper;

public class GeneratorOpFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(GeneratorOp.class);
    public static GeneratorOp createGen(String genNm,String genNum, double genRate,String genId)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return new GeneratorOp.Builder()
                .genId(id)
                .genName(genNm)
                .genNumber(genNum)
                .genRate(genRate)
                .build();
    }
}
