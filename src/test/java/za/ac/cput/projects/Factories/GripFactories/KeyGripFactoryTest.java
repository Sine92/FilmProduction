package za.ac.cput.projects.Factories.GripFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Grips.KeyGrip;

import static org.junit.Assert.*;

public class KeyGripFactoryTest {
    KeyGrip keyGrip;
    @Before
    public void setUp() throws Exception {
        keyGrip = KeyGripFactory.createKey("Abu","555",100.00);
    }

    @Test
    public void createKey() {

        assertEquals(keyGrip.getKgName(),keyGrip.getKgName());


    }
}