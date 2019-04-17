package za.ac.cput.projects.Unit.UnitFactories;

import za.ac.cput.projects.Unit.Medic;

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
