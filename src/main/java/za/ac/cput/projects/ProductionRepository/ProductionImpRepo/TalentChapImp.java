package za.ac.cput.projects.ProductionRepository.ProductionImpRepo;

import za.ac.cput.projects.Production.TalentChaperone;
import za.ac.cput.projects.ProductionRepository.TalentChaperoneRepo;

import java.util.Set;

public class TalentChapImp implements TalentChaperoneRepo {

    private static TalentChapImp talentChapImp = null;
    private Set<TalentChaperone> talentChaperoneSet;
    public static TalentChapImp getTalentChapImp()
    {
        if(talentChapImp == null) talentChapImp = new TalentChapImp();
        return talentChapImp;
    }

    @Override
    public Set<TalentChaperone> getAll() {
        return talentChaperoneSet;
    }

    @Override
    public TalentChaperone create(TalentChaperone talentChaperone) {
        this.talentChaperoneSet.add(talentChaperone);
        return talentChaperone;
    }

    @Override
    public void delete(String s) {
        talentChaperoneSet.removeIf(t->t.getTalName().equals(s));

    }

    @Override
    public TalentChaperone update(TalentChaperone talentChaperone) {
        if(talentChaperoneSet.contains(talentChaperone))
        {
            for(TalentChaperone talentChaperone1:talentChaperoneSet)
            {
                if(talentChaperone1.equals(talentChaperone))
                {
                    return talentChaperone;
                }
            }
        }
        return null;
    }

    @Override
    public TalentChaperone read(TalentChaperone talentChaperone) {

        if(talentChapImp.talentChaperoneSet.contains(talentChaperone))
        {
            for(TalentChaperone talentChaperone1:talentChaperoneSet)
            {
                if(talentChaperone1.equals(talentChaperone))
                {
                    return talentChaperone1;
                }
            }
        }
        return null;
    }
}
