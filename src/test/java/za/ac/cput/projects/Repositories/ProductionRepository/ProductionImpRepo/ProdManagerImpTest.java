package za.ac.cput.projects.Repositories.ProductionRepository.ProductionImpRepo;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Production.ProdManager;
import za.ac.cput.projects.Factories.ProductionFactories.ProdManagerFactory;

import static org.junit.Assert.*;

public class ProdManagerImpTest {

    private ProdManagerImp prodManagerImp;
    private ProdManager prodManager;
    @Before
    public void setUp() throws Exception {
        prodManagerImp = ProdManagerImp.getProdManagerImp();
        prodManager = ProdManagerFactory.creatProdMan("Nici","840",350.00);
    }

    @Test
    public void getAll() {
        assertEquals(prodManagerImp.getAll(),prodManagerImp.getAll());
    }

    @Test
    public void create() {
        assertEquals(prodManagerImp.create(prodManager),prodManagerImp.create(prodManager));
    }

    @Test
    public void delete() {
        prodManagerImp.delete(prodManager.getPrManName());
    }

    @Test
    public void update() {
        assertEquals(prodManagerImp.update(prodManager),prodManagerImp.update(prodManager));
    }

    @Test
    public void read() {
        assertEquals(prodManagerImp.read(prodManager.getPrManName()),prodManagerImp.read(prodManager.getPrManName()));
    }
}