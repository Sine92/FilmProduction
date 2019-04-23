package za.ac.cput.projects.Unit.UnitFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Unit.UnitManager;

import static org.junit.Assert.*;

public class UnitManagerFactoryTest {
     UnitManager unitManager;
    @Before
    public void setUp() throws Exception {
        unitManager = UnitManagerFactory.createUnitManager("Isaac","036",7500.00);
    }

    @Test
    public void createUnitManager() {
        assertEquals(unitManager.getUnMName(),unitManager.getUnMName());
    }
}