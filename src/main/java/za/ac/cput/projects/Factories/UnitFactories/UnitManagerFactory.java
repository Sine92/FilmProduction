package za.ac.cput.projects.Factories.UnitFactories;

import za.ac.cput.projects.Domain.Unit.UnitAssist;
import za.ac.cput.projects.Domain.Unit.UnitManager;
import za.ac.cput.projects.Util.Helper;

public class UnitManagerFactory {

    private static final String SUFFIX = Helper.getSuffixFromClassName(UnitManager.class);
    public static UnitManager createUnitManager(String unitMName,String unitMNum, double unitRate, String unMId) {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return new UnitManager.Builder()
                .unMId(id)
                .unMNumber(unitMNum)
                .unMName(unitMName)
                .unMRate(unitRate)
                .build();


    }

}
