package za.ac.cput.projects.Factories.CamFactories;

import za.ac.cput.projects.Domain.Camera.FocusPuller;
import za.ac.cput.projects.Domain.Camera.VTO;
import za.ac.cput.projects.Util.Helper;

public class VTOFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(VTO.class);
    public static VTO createVT(String vnm, String vnum, double vrate,String vtId)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return new VTO.Builder()
                .vtId(id)
                .vTName(vnm)
                .vTNumber(vnum)
                .vTRate(vrate)
                .build();
    }
}
