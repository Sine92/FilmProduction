package za.ac.cput.projects.Unit.UnitFactories;

import za.ac.cput.projects.Unit.UnitAssist;

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
