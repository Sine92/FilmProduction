package za.ac.cput.projects.Art;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Art.ArtFactories.PropsFactory;

import static org.junit.Assert.*;

public class PropsTest {
    Props props;
    @Before
    public void setUp() throws Exception {
        props = PropsFactory.ceateProps("Patrick","2635",69.26);
    }

    @Test
    public void getPropsName() {

        Assert.assertNotEquals(props.getPropsName(),props.getPropsName());
    }

    @Test
    public void getPropsNumber() {
    }

    @Test
    public void getPropsRate() {
    }
}