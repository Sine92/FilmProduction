package za.ac.cput.projects.Services.ProductionService.IMPL;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.Domain.Production.TalentChaperone;
import za.ac.cput.projects.Factories.ProductionFactories.TalentChaperoneFactory;
import za.ac.cput.projects.Repositories.ProductionRepository.ProductionImpRepo.TalentChapImp;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TalentChapServiceImplTest {
    private TalentChapImp talentChapImp;
    private TalentChaperone talentChaperone;
    @Before
    public void setUp() throws Exception {
        talentChapImp = TalentChapImp.getTalentChapImp();
        talentChaperone = TalentChaperoneFactory.createTalent("Nicholas","898",55.55);
    }

    @Test
    public void getAll() {
        Set<TalentChaperone> all = talentChapImp.getAll();
        assertSame(all,talentChapImp.getAll());
    }

    @Test
    public void create() {
        TalentChaperone create = this.talentChapImp.create(talentChaperone);
        assertSame(create,talentChapImp.create(talentChaperone));
    }

    @Test
    public void update() {

        TalentChaperone update = this.talentChapImp.create(talentChaperone);
        assertSame(update,talentChapImp.update(talentChaperone));
    }

    @Test
    public void delete() {
        talentChapImp.delete(talentChaperone.getTalName());
    }

    @Test
    public void read() {
        TalentChaperone read = this.talentChapImp.read(talentChaperone.getTalName());
        assertSame(read, this.talentChapImp.read(talentChaperone.getTalName()));
    }
}