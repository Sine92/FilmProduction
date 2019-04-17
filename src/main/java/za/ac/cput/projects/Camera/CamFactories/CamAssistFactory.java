package za.ac.cput.projects.Camera.CamFactories;

import za.ac.cput.projects.Camera.CamAssistant;

public class CamAssistFactory {

    public static CamAssistant createCamAss(String cnm,String cnum,double crate)
    {
        return new CamAssistant
                .Builder()
                .camAssistName(cnm)
                .camAssistNumber(cnum)
                .camAssistRate(crate)
                .build();
    }
}
