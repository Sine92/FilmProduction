package za.ac.cput.projects.Factories.ProductionFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Production.FirstAD;

import static org.junit.Assert.*;

public class FirstADFactoryTest {
    FirstAD firstAD;
    @Before
    public void setUp() throws Exception {

        firstAD = FirstADFactory.createFD("Sean","2003",500.00);
    }

    @Test
    public void createFD() {
        assertEquals(firstAD.getfAdName(),firstAD.getfAdName());
    }
}