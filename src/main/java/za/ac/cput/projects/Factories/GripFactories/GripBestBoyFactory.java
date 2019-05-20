package za.ac.cput.projects.Factories.GripFactories;

import za.ac.cput.projects.Domain.Grips.GripBestBoy;

public class GripBestBoyFactory {

    public static GripBestBoy createGrip(String gnm,String gnum, double grate)
    {
        return new GripBestBoy.Builder()
                .gbName(gnm)
                .gbNumber(gnum)
                .gbRate(grate)
                .build();
    }

}
