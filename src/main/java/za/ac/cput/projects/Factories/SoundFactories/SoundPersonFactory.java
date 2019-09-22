package za.ac.cput.projects.Factories.SoundFactories;

import za.ac.cput.projects.Domain.Sound.BoomSwinger;
import za.ac.cput.projects.Domain.Sound.SoundPerson;
import za.ac.cput.projects.Util.Helper;

public class SoundPersonFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(SoundPerson.class);
    public static SoundPerson createSP(String spName, String spNum, double spRate,String spId)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return new SoundPerson.Builder()
                .spId(id)
                .spName(spName)
                .spNumber(spNum)
                .spRate(spRate)
                .build();
    }

}
