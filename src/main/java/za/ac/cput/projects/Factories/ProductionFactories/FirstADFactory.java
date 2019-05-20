package za.ac.cput.projects.Factories.ProductionFactories;

import za.ac.cput.projects.Domain.Production.FirstAD;

public class FirstADFactory {

    public static FirstAD createFD(String fnm, String fnum,double frate)
    {
        return new FirstAD.Builder()
                .fAdName(fnm)
                .fAdNumber(fnum)
                .fAdRate(frate)
                .build();
    }

}
