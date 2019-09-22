package za.ac.cput.projects.Factories.GripFactories;

import za.ac.cput.projects.Domain.Grips.GripBestBoy;
import za.ac.cput.projects.Domain.Grips.KeyGrip;
import za.ac.cput.projects.Util.Helper;

public class KeyGripFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(KeyGrip.class);
    public static KeyGrip createKey(String knm,String knum,double krate,String kgId)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return new KeyGrip
                   .Builder()
                .kgId(id)
                    .kgName(knm)
                    .kgNumber(knum)
                    .kgRate(krate)
                    .build();
    }
}
