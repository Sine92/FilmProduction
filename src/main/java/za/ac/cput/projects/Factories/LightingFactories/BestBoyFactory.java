package za.ac.cput.projects.Factories.LightingFactories;

import za.ac.cput.projects.Domain.Grips.KeyGrip;
import za.ac.cput.projects.Domain.Lighting.BestBoy;
import za.ac.cput.projects.Util.Helper;

public class BestBoyFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(BestBoy.class);
    public static BestBoy createBest(String bnm, String bnum, double brate,String bbId)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return new BestBoy.Builder().bbId(id).bbName(bnm).bbNumber(bnum).bbRate(brate).build();
    }
}
