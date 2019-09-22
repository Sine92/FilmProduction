package za.ac.cput.projects.Factories.SoundFactories;

import za.ac.cput.projects.Domain.Production.TalentChaperone;
import za.ac.cput.projects.Domain.Sound.BoomSwinger;
import za.ac.cput.projects.Util.Helper;

public class BoomSwingerFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(BoomSwinger.class);
    public static BoomSwinger createBoomS(String bmsName, String bmsNum, double bmsRate)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return new BoomSwinger.Builder()
                .bsId(id)
                .bsName(bmsName)
                .bsNumber(bmsNum)
                .bsRate(bmsRate)
                .build();
    }
}
