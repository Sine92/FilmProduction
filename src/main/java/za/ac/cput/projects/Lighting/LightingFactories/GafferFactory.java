package za.ac.cput.projects.Lighting.LightingFactories;

import za.ac.cput.projects.Lighting.Gaffer;

public class GafferFactory {

    public static Gaffer createGaf(String gafnm, String gafnum, double gafrate)
    {
        return new Gaffer.Builder()
                .gafName(gafnm)
                .gafNumber(gafnum)
                .gafRate(gafrate)
                .build();
    }
}
