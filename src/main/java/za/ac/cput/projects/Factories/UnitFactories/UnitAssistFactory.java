package za.ac.cput.projects.Factories.UnitFactories;

import za.ac.cput.projects.Domain.Unit.UnitAssist;

public class UnitAssistFactory {

    public static UnitAssist createUnit(String unaName,String unaNum, double unaRate)
    {
        return new UnitAssist.Builder()
                .unName(unaName)
                .unNumber(unaNum)
                .unRate(unaRate)
                .build();
    }
}
