package za.ac.cput.projects.Grips.GripFactories;

import za.ac.cput.projects.Grips.KeyGrip;

public class KeyGripFactory {

    public static KeyGrip createKey(String knm,String knum,double krate)
    {
        return new KeyGrip
                   .Builder()
                    .kgName(knm)
                    .kgNumber(knum)
                    .kgRate(krate)
                    .build();
    }
}
