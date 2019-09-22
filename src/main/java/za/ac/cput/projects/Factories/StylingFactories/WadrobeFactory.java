package za.ac.cput.projects.Factories.StylingFactories;

import za.ac.cput.projects.Domain.Styling.MakeUpAssist;
import za.ac.cput.projects.Domain.Styling.Wadrobe;
import za.ac.cput.projects.Util.Helper;

public class WadrobeFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(Wadrobe.class);
    public static Wadrobe createWadrop(String wadNam, String wadNum, double wadRate,String wadId)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return new Wadrobe.Builder()
                .wadId(id)
                .wadName(wadNam)
                .wadNumber(wadNum)
                .wadRate(wadRate)
                .build();
    }
}
