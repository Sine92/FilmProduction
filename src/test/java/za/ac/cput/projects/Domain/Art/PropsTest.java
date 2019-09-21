package za.ac.cput.projects.Domain.Art;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Factories.ArtFactories.PropsFactory;

public class PropsTest {
    private Props props;
    @Before
    public void setUp() throws Exception {
        props = PropsFactory.ceateProps("Pat","2635",69.26);
    }

    @Test
    public void getPropsName() {

        Assert.assertEquals(props.getPropsName(),props.getPropsName());
    }

    @Test
    public void getPropsNumber() {
    }

    @Test
    public void getPropsRate() {
    }
}