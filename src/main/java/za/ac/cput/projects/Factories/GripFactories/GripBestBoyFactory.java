package za.ac.cput.projects.Factories.GripFactories;

import za.ac.cput.projects.Domain.Catering.CaterTeamLeader;
import za.ac.cput.projects.Domain.Grips.GripBestBoy;
import za.ac.cput.projects.Domain.Grips.KeyGrip;
import za.ac.cput.projects.Util.Helper;

public class GripBestBoyFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(GripBestBoy.class);
    public static GripBestBoy createGrip(String gnm,String gnum, double grate)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return new GripBestBoy.Builder()
                .gbName(gnm)
                .gbId(id)
                .gbNumber(gnum)
                .gbRate(grate)
                .build();
    }

}
