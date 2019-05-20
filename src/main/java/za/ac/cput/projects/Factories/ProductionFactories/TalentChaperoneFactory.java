package za.ac.cput.projects.Factories.ProductionFactories;

import za.ac.cput.projects.Domain.Production.TalentChaperone;

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
