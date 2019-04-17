package za.ac.cput.projects.Lighting.LightingFactories;

import za.ac.cput.projects.Lighting.GeneratorOp;

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
