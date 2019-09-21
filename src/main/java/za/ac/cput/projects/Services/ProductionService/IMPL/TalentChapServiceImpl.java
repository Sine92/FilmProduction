package za.ac.cput.projects.Services.ProductionService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Production.TalentChaperone;
import za.ac.cput.projects.Repositories.ProductionRepository.ProductionImpRepo.TalentChapImp;
import za.ac.cput.projects.Services.ProductionService.TalentChapService;

import java.util.Set;
@Service("TalentChapServiceImpl")
public class TalentChapServiceImpl implements TalentChapService {
    @Autowired
    @Qualifier("TalentChapServiceImpl")
    private TalentChapServiceImpl service = null;
    private TalentChapImp talentChapImp;
    @Override
    public Set<TalentChaperone> getAll() {
        return talentChapImp.getAll();
    }

    @Override
    public TalentChaperone create(TalentChaperone talentChaperone) {
        return talentChapImp.create(talentChaperone);
    }

    @Override
    public TalentChaperone update(TalentChaperone talentChaperone) {
        return talentChapImp.update(talentChaperone);
    }

    @Override
    public void delete(String s) {
        talentChapImp.delete(s);

    }

    @Override
    public TalentChaperone read(String s) {
        return talentChapImp.read(s);
    }
}
