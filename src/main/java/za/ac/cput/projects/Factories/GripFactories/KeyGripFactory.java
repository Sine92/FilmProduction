package za.ac.cput.projects.Factories.GripFactories;

import za.ac.cput.projects.Domain.Grips.KeyGrip;

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
