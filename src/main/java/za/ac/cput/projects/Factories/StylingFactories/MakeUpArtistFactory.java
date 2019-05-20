package za.ac.cput.projects.Factories.StylingFactories;

import za.ac.cput.projects.Domain.Styling.MakeUpAssist;

public class MakeUpArtistFactory {
    public static MakeUpAssist createMakeUp(String mkpNam, String mkpNum, double mkpRate)
    {
        return new MakeUpAssist.Builder()
                .makeUAName(mkpNam)
                .makeUANumber(mkpNum)
                .makeUARate(mkpRate)
                .build();
    }
}
