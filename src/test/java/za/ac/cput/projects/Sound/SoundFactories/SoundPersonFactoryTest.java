package za.ac.cput.projects.Sound.SoundFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Sound.SoundPerson;

import static org.junit.Assert.*;

public class SoundPersonFactoryTest {
    SoundPerson soundPerson;
    @Before
    public void setUp() throws Exception {
        soundPerson = SoundPersonFactory.createSP("William", "500.00",300.00);
    }

    @Test
    public void createSP() {

        assertEquals(soundPerson.getSpName(),soundPerson.getSpName());
    }
}