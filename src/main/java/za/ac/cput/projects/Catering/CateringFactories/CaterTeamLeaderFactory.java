package za.ac.cput.projects.Catering.CateringFactories;

import za.ac.cput.projects.Catering.CaterTeamLeader;

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
