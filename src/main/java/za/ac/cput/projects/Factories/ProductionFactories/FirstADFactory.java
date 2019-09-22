package za.ac.cput.projects.Factories.ProductionFactories;

import za.ac.cput.projects.Domain.Lighting.Spark;
import za.ac.cput.projects.Domain.Production.FirstAD;
import za.ac.cput.projects.Util.Helper;

public class FirstADFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(FirstAD.class);
    public static FirstAD createFD(String fnm, String fnum,double frate,String faId)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return new FirstAD.Builder()
                .faId(id)
                .fAdName(fnm)
                .fAdNumber(fnum)
                .fAdRate(frate)
                .build();
    }

}
