package za.ac.cput.projects.Factories.SoundFactories;

import za.ac.cput.projects.Domain.Sound.BoomSwinger;

public class BoomSwingerFactory {

    public static BoomSwinger createBoomS(String bmsName, String bmsNum, double bmsRate)
    {
        return new BoomSwinger.Builder()
                .bsName(bmsName)
                .bsNumber(bmsNum)
                .bsRate(bmsRate)
                .build();
    }
}
