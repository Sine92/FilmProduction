package za.ac.cput.projects.Factories.LightingFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Lighting.Gaffer;

import static org.junit.Assert.*;

public class GafferFactoryTest {
    Gaffer gaffer;
    @Before
    public void setUp() throws Exception {

        gaffer = GafferFactory.createGaf("Bernie","565",200.00);
    }

    @Test
    public void createGaf() {

        assertEquals(gaffer.getGafName(),gaffer.getGafName());
    }
}