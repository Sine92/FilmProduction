package za.ac.cput.projects.Unit.UnitFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Unit.UnitAssist;

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