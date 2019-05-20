package za.ac.cput.projects.Factories.ProductionFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Production.ProdManager;

import static org.junit.Assert.*;

public class ProdManagerFactoryTest {
     ProdManager prodManager;
    @Before
    public void setUp() throws Exception {
        prodManager = ProdManagerFactory.creatProdMan("Nicola","6556",900.00);
    }

    @Test
    public void creatProdMan() {

        assertEquals(prodManager.getPrManName(),prodManager.getPrManName());
    }
}