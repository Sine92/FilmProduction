package za.ac.cput.projects.Factories.CamFactories;

import za.ac.cput.projects.Domain.Camera.VTO;

public class VTOFactory {

    public static VTO createVT(String vnm, String vnum, double vrate)
    {
        return new VTO.Builder()
                .vTName(vnm)
                .vTNumber(vnum)
                .vTRate(vrate)
                .build();
    }
}
