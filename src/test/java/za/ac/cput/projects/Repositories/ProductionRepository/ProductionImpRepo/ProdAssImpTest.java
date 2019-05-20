package za.ac.cput.projects.Repositories.ProductionRepository.ProductionImpRepo;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Production.ProductionAssist;
import za.ac.cput.projects.Factories.ProductionFactories.ProdManagerFactory;
import za.ac.cput.projects.Factories.ProductionFactories.ProductionAssistFactory;

import static org.junit.Assert.*;

public class ProdAssImpTest {
 private ProdAssImp prodAssImp;
 private ProductionAssist productionAssist;
    @Before
    public void setUp() throws Exception {
        prodAssImp = ProdAssImp.getProdAssImp();
        productionAssist = ProductionAssistFactory.createPA("Temba","262",120.00);
    }

    @Test
    public void getAll() {
        assertEquals(prodAssImp.getAll(),prodAssImp.getAll());
    }

    @Test
    public void create() {

        assertEquals(prodAssImp.create(productionAssist),prodAssImp.create(productionAssist));
    }

    @Test
    public void delete() {
        prodAssImp.delete(productionAssist.getPaName());
    }

    @Test
    public void update() {
        assertEquals(prodAssImp.update(productionAssist),prodAssImp.update(productionAssist));
    }

    @Test
    public void read() {
        assertEquals(prodAssImp.read(productionAssist.getPaName()),prodAssImp.read(productionAssist.getPaName()));
    }
}