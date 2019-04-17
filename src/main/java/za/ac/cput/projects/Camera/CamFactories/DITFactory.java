package za.ac.cput.projects.Camera.CamFactories;

import za.ac.cput.projects.Camera.DIT;

public class DITFactory {
    public static DIT createDit(String dnm,String dnum,double drate)
    {
        return  new DIT
                .Builder()
                .ditName(dnm)
                .ditNumber(dnum)
                .ditRate(drate)
                .build();
    }

}
