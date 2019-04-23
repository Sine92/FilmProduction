package za.ac.cput.projects.Camera.CamFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Camera.VTO;

import static org.junit.Assert.*;

public class VTOFactoryTest {
   VTO vt;
    @Before
    public void setUp() throws Exception {
        vt = VTOFactory.createVT("Lennox","021",7500.00);
    }

    @Test
    public void createVT() {

        assertEquals(vt.getvTName(),vt.getvTName());
    }

}