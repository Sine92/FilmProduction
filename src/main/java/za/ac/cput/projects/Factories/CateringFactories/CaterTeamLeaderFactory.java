package za.ac.cput.projects.Factories.CateringFactories;

import za.ac.cput.projects.Domain.Catering.CaterTeamLeader;

public class CaterTeamLeaderFactory {

    public static CaterTeamLeader createCater(String catNm, String catNum, double catRate)
    {
        return new CaterTeamLeader
                   .Builder()
                .ctTName(catNm)
                .ctNumber(catNum)
                .ctTRate(catRate)
                .build();
    }
}
