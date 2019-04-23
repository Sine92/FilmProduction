package za.ac.cput.projects.Camera.CamFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Camera.CamAssistant;

import static org.junit.Assert.*;

public class CamAssistFactoryTest {
    CamAssistant camA;
    @Before
    public void setUp() throws Exception {
        camA = CamAssistFactory.createCamAss("Leo","172",200.00);
    }

    @Test
    public void createCamAss() {
        assertEquals(camA.getCamAssistName(),camA.getCamAssistName());
    }
}