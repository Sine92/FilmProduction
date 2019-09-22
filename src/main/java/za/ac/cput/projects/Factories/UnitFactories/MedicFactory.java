package za.ac.cput.projects.Factories.UnitFactories;

import za.ac.cput.projects.Domain.Styling.MakeUpAssist;
import za.ac.cput.projects.Domain.Unit.Medic;
import za.ac.cput.projects.Util.Helper;

public class MedicFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(Medic.class);
    public static Medic createMedic(String medName,String medNum, double medRate,String medId)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return new Medic.Builder()
                .medId(id)
                .medName(medName)
                .medNumber(medNum)
                .medRate(medRate)
                .build();
    }

}
