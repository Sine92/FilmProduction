package za.ac.cput.projects.Production.ProductionFactories;

import za.ac.cput.projects.Production.TalentChaperone;

public class TalentChaperoneFactory {

    public static TalentChaperone createTalent(String talNam,String talNum, double talRate)
    {
        return new TalentChaperone.Builder()
                .talName(talNam)
                .talNumber(talNum)
                .talRate(talRate)
                .build();
    }
}
