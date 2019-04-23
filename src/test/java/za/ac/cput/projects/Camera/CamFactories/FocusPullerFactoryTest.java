package za.ac.cput.projects.Camera.CamFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Camera.FocusPuller;

import static org.junit.Assert.*;

public class FocusPullerFactoryTest {
     FocusPuller focusPuller;
    @Before
    public void setUp() throws Exception {
        focusPuller = FocusPullerFactory.createFocusP("Zain","365",500.00);
    }

    @Test
    public void createFocusP() {
        assertEquals(focusPuller.getFocusPName(),focusPuller.getFocusPName());
    }
}