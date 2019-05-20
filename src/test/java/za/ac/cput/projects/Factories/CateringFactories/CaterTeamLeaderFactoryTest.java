package za.ac.cput.projects.Factories.CateringFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Catering.CaterTeamLeader;

import static org.junit.Assert.*;

public class CaterTeamLeaderFactoryTest {
    CaterTeamLeader caterTeamLeader;
    @Before
    public void setUp() throws Exception {
        caterTeamLeader = CaterTeamLeaderFactory.createCater("Bongi", "032",450.00);
    }

    @Test
    public void createCater() {
     assertEquals(caterTeamLeader.getCtTName(),caterTeamLeader.getCtTName());
    }
}