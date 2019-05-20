package za.ac.cput.projects.Factories.SoundFactories;

import za.ac.cput.projects.Domain.Sound.SoundPerson;

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
