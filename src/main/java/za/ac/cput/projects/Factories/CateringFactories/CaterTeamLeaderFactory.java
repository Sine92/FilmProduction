package za.ac.cput.projects.Factories.CateringFactories;

import za.ac.cput.projects.Domain.Camera.VTO;
import za.ac.cput.projects.Domain.Catering.CaterTeamLeader;
import za.ac.cput.projects.Util.Helper;

public class CaterTeamLeaderFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(CaterTeamLeader.class);
    public static CaterTeamLeader createCater(String catNm, String catNum, double catRate, String ctId)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return new CaterTeamLeader
                   .Builder()
                .ctId(id)
                .ctTName(catNm)
                .ctNumber(catNum)
                .ctTRate(catRate)
                .build();
    }
}
