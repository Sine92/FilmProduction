package za.ac.cput.projects.Factories.StylingFactories;

import za.ac.cput.projects.Domain.Sound.SoundPerson;
import za.ac.cput.projects.Domain.Styling.MakeUpAssist;
import za.ac.cput.projects.Util.Helper;

public class MakeUpArtistFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(MakeUpAssist.class);
    public static MakeUpAssist createMakeUp(String mkpNam, String mkpNum, double mkpRate,String makeAUId)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return new MakeUpAssist.Builder()
                .makeUAId(id)
                .makeUAName(mkpNam)
                .makeUANumber(mkpNum)
                .makeUARate(mkpRate)
                .build();
    }
}
