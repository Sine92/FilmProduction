package za.ac.cput.projects.Camera.CamFactories;

import za.ac.cput.projects.Camera.FocusPuller;

public class FocusPullerFactory {

    public static FocusPuller createFocusP(String fnm,String fnum,double frate)
    {
        return new FocusPuller
                .Builder()
                .focusPName(fnm)
                .focusPNumber(fnum)
                .focusPRate(frate)
                .build();
    }
}
