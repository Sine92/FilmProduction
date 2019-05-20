package za.ac.cput.projects.Factories.UnitFactories;

import za.ac.cput.projects.Domain.Unit.UnitManager;

public class UnitManagerFactory {

    public static UnitManager createUnitManager(String unitMName,String unitMNum, double unitRate) {

        return new UnitManager.Builder()
                .unMNumber(unitMNum)
                .unMName(unitMName)
                .unMRate(unitRate)
                .build();


    }

}
