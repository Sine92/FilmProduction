package za.ac.cput.projects.Repositories.ProductionRepository.ProductionImpRepo;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Production.TalentChaperone;
import za.ac.cput.projects.Factories.ProductionFactories.TalentChaperoneFactory;

import static org.junit.Assert.*;

public class TalentChapImpTest {
    private TalentChapImp talentChapImp;
    private TalentChaperone talentChaperone;

    @Before
    public void setUp() throws Exception {
        talentChapImp = TalentChapImp.getTalentChapImp();
        talentChaperone = TalentChaperoneFactory.createTalent("Dominic","011",54.20);
    }

    @Test
    public void getAll() {
        assertEquals(talentChapImp.getAll(),talentChapImp.getAll());
    }

    @Test
    public void create() {
        assertEquals(talentChapImp.create(talentChaperone),talentChapImp.create(talentChaperone));
    }

    @Test
    public void delete() {
        talentChapImp.delete(talentChaperone.getTalName());
    }

    @Test
    public void update() {
        assertEquals(talentChapImp.update(talentChaperone),talentChapImp.update(talentChaperone));
    }

    @Test
    public void read() {
        assertEquals(talentChapImp.read(talentChaperone.getTalName()),talentChapImp.read(talentChaperone.getTalName()));
    }
}