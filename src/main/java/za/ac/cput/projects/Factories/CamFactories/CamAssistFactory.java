package za.ac.cput.projects.Factories.CamFactories;

import za.ac.cput.projects.Domain.Art.Props;
import za.ac.cput.projects.Domain.Camera.CamAssistant;
import za.ac.cput.projects.Util.Helper;

public class CamAssistFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(CamAssistant.class);
    public static CamAssistant createCamAss(String cnm,String cnum,double crate)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return new CamAssistant
                .Builder()
                .camAssId(id)
                .camAssistName(cnm)
                .camAssistNumber(cnum)
                .camAssistRate(crate)
                .build();
    }
}
