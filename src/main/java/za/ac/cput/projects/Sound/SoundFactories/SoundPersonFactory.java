package za.ac.cput.projects.Sound.SoundFactories;

import za.ac.cput.projects.Sound.SoundPerson;

public class SoundPersonFactory {
    public static SoundPerson createSP(String spName, String spNum, double spRate)
    {
        return new SoundPerson.Builder()
                .spName(spName)
                .spNumber(spNum)
                .spRate(spRate)
                .build();
    }

}
