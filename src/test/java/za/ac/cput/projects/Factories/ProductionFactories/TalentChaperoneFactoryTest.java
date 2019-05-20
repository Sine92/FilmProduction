package za.ac.cput.projects.Factories.ProductionFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Production.TalentChaperone;

import static org.junit.Assert.*;

public class TalentChaperoneFactoryTest {
    TalentChaperone talentChaperone;
    @Before
    public void setUp() throws Exception {
        talentChaperone = TalentChaperoneFactory.createTalent("Dominic","357",950.00);
    }

    @Test
    public void createTalent() {

        assertEquals(talentChaperone.getTalName(),talentChaperone.getTalName());
    }
}