package za.ac.cput.projects.Factories.ProductionFactories;

import za.ac.cput.projects.Domain.Production.Producer;
import za.ac.cput.projects.Domain.Production.ProductionAssist;
import za.ac.cput.projects.Util.Helper;

public class ProductionAssistFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(ProductionAssist.class);
    public static ProductionAssist createPA(String paNm, String paNum, double paRate)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return new ProductionAssist.Builder()
                .paId(id)
                .paName(paNm)
                .paNumber(paNum)
                .paRate(paRate)
                .build();
    }
}
