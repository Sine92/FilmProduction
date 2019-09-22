package za.ac.cput.projects.Factories.CamFactories;

import za.ac.cput.projects.Domain.Art.Props;
import za.ac.cput.projects.Domain.Camera.FocusPuller;
import za.ac.cput.projects.Util.Helper;

public class FocusPullerFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(FocusPuller.class);
    public static FocusPuller createFocusP(String fnm,String fnum,double frate,String focuspullerId)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return new FocusPuller
                .Builder()
                .focusPullerId(id)
                .focusPName(fnm)
                .focusPNumber(fnum)
                .focusPRate(frate)
                .build();
    }
}
