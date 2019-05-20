package za.ac.cput.projects.Factories.LightingFactories;

import za.ac.cput.projects.Domain.Lighting.GeneratorOp;

public class GeneratorOpFactory {

    public static GeneratorOp createGen(String genNm,String genNum, double genRate)
    {
        return new GeneratorOp.Builder()
                .genName(genNm)
                .genNumber(genNum)
                .genRate(genRate)
                .build();
    }
}
