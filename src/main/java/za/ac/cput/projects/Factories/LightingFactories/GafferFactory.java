package za.ac.cput.projects.Factories.LightingFactories;

import za.ac.cput.projects.Domain.Lighting.BestBoy;
import za.ac.cput.projects.Domain.Lighting.Gaffer;
import za.ac.cput.projects.Util.Helper;

public class GafferFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(Gaffer.class);
    public static Gaffer createGaf(String gafnm, String gafnum, double gafrate,String gafId)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return new Gaffer.Builder()
                .gafId(id)
                .gafName(gafnm)
                .gafNumber(gafnum)
                .gafRate(gafrate)
                .build();
    }
}
