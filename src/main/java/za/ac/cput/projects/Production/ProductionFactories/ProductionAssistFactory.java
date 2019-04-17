package za.ac.cput.projects.Production.ProductionFactories;

import za.ac.cput.projects.Production.ProductionAssist;

public class ProductionAssistFactory {

    public static ProductionAssist createPA(String paNm, String paNum, double paRate)
    {
        return new ProductionAssist.Builder()
                .paName(paNm)
                .paNumber(paNum)
                .paRate(paRate)
                .build();
    }
}
