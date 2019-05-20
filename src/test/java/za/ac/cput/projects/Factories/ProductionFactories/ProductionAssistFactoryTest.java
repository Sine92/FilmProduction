package za.ac.cput.projects.Factories.ProductionFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Production.ProductionAssist;

import static org.junit.Assert.*;

public class ProductionAssistFactoryTest {
     ProductionAssist productionAssist;
    @Before
    public void setUp() throws Exception {
        productionAssist = ProductionAssistFactory.createPA("Temba","071",1000.00);
    }

    @Test
    public void createPA() {

        assertEquals("Temba",productionAssist.getPaName());
    }
}