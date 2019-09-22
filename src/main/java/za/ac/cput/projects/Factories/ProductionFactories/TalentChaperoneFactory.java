package za.ac.cput.projects.Factories.ProductionFactories;

import za.ac.cput.projects.Domain.Production.ProductionAssist;
import za.ac.cput.projects.Domain.Production.TalentChaperone;
import za.ac.cput.projects.Util.Helper;

public class TalentChaperoneFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(TalentChaperone.class);
    public static TalentChaperone createTalent(String talNam,String talNum, double talRate)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return new TalentChaperone.Builder()
                .talId(id)
                .talName(talNam)
                .talNumber(talNum)
                .talRate(talRate)
                .build();
    }
}
