package za.ac.cput.projects.Factories.LightingFactories;

import za.ac.cput.projects.Domain.Lighting.BestBoy;

public class BestBoyFactory {

    public static BestBoy createBest(String bnm, String bnum, double brate)
    {
        return new BestBoy.Builder().bbName(bnm).bbNumber(bnum).bbRate(brate).build();
    }
}
