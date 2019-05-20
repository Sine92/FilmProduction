package za.ac.cput.projects.Factories.ArtFactories;

import za.ac.cput.projects.Domain.Art.PropMaster;

public class PropMasterFactory {

    public static PropMaster createPropMaster(String nm, String num, double rate)
    {
        return  new PropMaster
                .Builder()
                .propMasterName(nm)
                .propMasterNu0mber(num)
                .propMasterRate(rate)
                .build();
    }

}
