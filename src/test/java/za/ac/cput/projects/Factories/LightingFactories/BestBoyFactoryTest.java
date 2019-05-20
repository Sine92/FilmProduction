package za.ac.cput.projects.Factories.LightingFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Lighting.BestBoy;

import static org.junit.Assert.*;

public class BestBoyFactoryTest {
    BestBoy bestBoy;
    @Before
    public void setUp() throws Exception {
        bestBoy = BestBoyFactory.createBest("Marcel","077",111.00);
    }

    @Test
    public void createBest() {

        assertEquals(bestBoy.getBbName(),bestBoy.getBbName());
    }
}