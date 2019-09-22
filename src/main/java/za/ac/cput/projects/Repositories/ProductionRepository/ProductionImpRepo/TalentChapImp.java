package za.ac.cput.projects.Repositories.ProductionRepository.ProductionImpRepo;

import za.ac.cput.projects.Domain.Production.TalentChaperone;
import za.ac.cput.projects.Repositories.ProductionRepository.TalentChaperoneRepo;

import java.util.Set;

public class TalentChapImp implements TalentChaperoneRepo {

    private static TalentChapImp talentChapImp = null;
    private Set<TalentChaperone> talentChaperoneSet;
    public static TalentChapImp getTalentChapImp()
    {
        if(talentChapImp == null) talentChapImp = new TalentChapImp();
        return talentChapImp;
    }
     private TalentChaperone findTalChap(String talId)
     {
         return this.talentChaperoneSet.stream()
                 .filter(talentChaperone -> talentChaperone.getTalId().trim().equals(talId))
                 .findAny()
                 .orElse(null);
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
    public void delete(String talId) {
       TalentChaperone toDelete = findTalChap(talId);
       if(toDelete!=null){
           this.talentChaperoneSet.remove(toDelete);
       }

    }

    @Override
    public TalentChaperone update(TalentChaperone talentChaperone) {
        TalentChaperone toUpdate = findTalChap(talentChaperone.getTalId());
        if(toUpdate!=null){
            this.talentChaperoneSet.remove(toUpdate);
            return create(talentChaperone);
        }
       return null;
    }

    @Override
    public TalentChaperone read(String talId) {

        TalentChaperone talentChaperone = findTalChap(talId);
        return talentChaperone;
    }
}
