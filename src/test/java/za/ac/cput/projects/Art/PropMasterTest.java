package za.ac.cput.projects.Art;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Art.ArtFactories.PropMasterFactory;

import static org.junit.Assert.*;

public class PropMasterTest {
      PropMaster propMaster;
    @Before
    public void setUp() throws Exception {
        propMaster = PropMasterFactory.createPropMaster("Nicky","1253",5000.00);
    }

    @Test
    public void getPropMasterName() {
    }

    @Test
    public void getPropMasterNumber() {
    }

    @Test
    public void getPropMasterRate() {
        Assert.assertNotEquals(propMaster.getPropMasterRate(),2500.00);
    }
}