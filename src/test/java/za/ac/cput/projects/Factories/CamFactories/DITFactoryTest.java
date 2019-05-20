package za.ac.cput.projects.Factories.CamFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Camera.DIT;

import static org.junit.Assert.*;

public class DITFactoryTest {
    DIT dit;
    @Before
    public void setUp() throws Exception {
        dit = DITFactory.createDit("Johan","0712",1500.00);
    }

    @Test
    public void createDit() {

        assertEquals(dit.getDitName(),dit.getDitName());
    }
}