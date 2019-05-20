package za.ac.cput.projects.Factories.UnitFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Unit.UnitAssist;

import static org.junit.Assert.*;

public class UnitAssistFactoryTest {
    UnitAssist unitAssist;

    @Before
    public void setUp() throws Exception {

        unitAssist = UnitAssistFactory.createUnit("Nko", "072", 263.25);
    }

    @Test
    public void createUnit() {

        assertEquals("Nko", unitAssist.getUnName());
    }


}