package za.ac.cput.projects.Factories.ArtFactories;

import za.ac.cput.projects.Domain.Art.PropMaster;
import za.ac.cput.projects.Util.Helper;

public class PropMasterFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(PropMaster.class);
    public static PropMaster createPropMaster(String nm, String num, double rate,String propMasterId)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return  new PropMaster
                .Builder()
                .propMasterId(id)
                .propMasterName(nm)
                .propMasterNumber(num)
                .propMasterRate(rate)
                .build();
    }

}
