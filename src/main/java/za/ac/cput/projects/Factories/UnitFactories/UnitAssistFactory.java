package za.ac.cput.projects.Factories.UnitFactories;

import za.ac.cput.projects.Domain.Unit.Medic;
import za.ac.cput.projects.Domain.Unit.UnitAssist;
import za.ac.cput.projects.Util.Helper;

public class UnitAssistFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(UnitAssist.class);
    public static UnitAssist createUnit(String unaName,String unaNum, double unaRate)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return new UnitAssist.Builder()
                .unId(id)
                .unName(unaName)
                .unNumber(unaNum)
                .unRate(unaRate)
                .build();
    }
}
