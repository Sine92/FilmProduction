package za.ac.cput.projects.Sound.SoundFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Sound.BoomSwinger;

import static org.junit.Assert.*;

public class BoomSwingerFactoryTest {
     BoomSwinger boomSwinger;
    @Before
    public void setUp() throws Exception {
        boomSwinger = BoomSwingerFactory.createBoomS("Lubabalo","120363",100.00);
    }

    @Test
    public void createBoomS() {

        assertEquals(boomSwinger.getBsName(),boomSwinger.getBsName());
    }
}