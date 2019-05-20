package za.ac.cput.projects.Factories.UnitFactories;

import za.ac.cput.projects.Domain.Unit.Medic;

public class MedicFactory {

    public static Medic createMedic(String medName,String medNum, double medRate)
    {
        return new Medic.Builder()
                .medName(medName)
                .medNumber(medNum)
                .medRate(medRate)
                .build();
    }

}
