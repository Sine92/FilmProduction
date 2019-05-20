package za.ac.cput.projects.Factories.StylingFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Styling.Wadrobe;

import static org.junit.Assert.*;

public class WadrobeFactoryTest {
    Wadrobe wadrobe;
    @Before
    public void setUp() throws Exception {
        wadrobe = WadrobeFactory.createWadrop("Carthy","012",500.00);
    }

    @Test
    public void createWadrop() {
        assertEquals("Carthy",wadrobe.getWadName());
    }
}