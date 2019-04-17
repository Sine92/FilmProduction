package za.ac.cput.projects.Sound.SoundFactories;

import za.ac.cput.projects.Sound.BoomSwinger;

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
