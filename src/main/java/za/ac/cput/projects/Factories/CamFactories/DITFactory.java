package za.ac.cput.projects.Factories.CamFactories;

import za.ac.cput.projects.Domain.Art.Props;
import za.ac.cput.projects.Domain.Camera.DIT;
import za.ac.cput.projects.Util.Helper;

public class DITFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(DIT.class);
    public static DIT createDit(String dnm,String dnum,double drate,String ditId)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return  new DIT
                .Builder()
                .ditId(id)
                .ditName(dnm)
                .ditNumber(dnum)
                .ditRate(drate)
                .build();
    }

}
