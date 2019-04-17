package za.ac.cput.projects.Lighting.LightingFactories;

import za.ac.cput.projects.Lighting.BestBoy;

public class BestBoyFactory {

    public static BestBoy createBest(String bnm, String bnum, double brate)
    {
        return new BestBoy.Builder().bbName(bnm).bbNumber(bnum).bbRate(brate).build();
    }
}
