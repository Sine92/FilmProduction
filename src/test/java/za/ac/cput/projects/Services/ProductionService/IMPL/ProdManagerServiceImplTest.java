package za.ac.cput.projects.Services.ProductionService.IMPL;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.Domain.Production.ProdManager;
import za.ac.cput.projects.Factories.ProductionFactories.ProdManagerFactory;
import za.ac.cput.projects.Repositories.ProductionRepository.ProductionImpRepo.ProdManagerImp;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProdManagerServiceImplTest {

    private ProdManagerImp prodManagerImp;
    private ProdManager prodManager;
    @Before
    public void setUp() throws Exception {
        prodManagerImp = ProdManagerImp.getProdManagerImp();
        prodManager = ProdManagerFactory.creatProdMan("Di","263",50.00);
    }

    @Test
    public void getAll() {
        Set<ProdManager> all = this.prodManagerImp.getAll();
        assertSame(all,prodManagerImp.getAll());
    }

    @Test
    public void create() {
        ProdManager create = this.prodManagerImp.create(prodManager);
        assertSame(create,prodManagerImp.create(prodManager));
    }

    @Test
    public void update() {
        ProdManager update = this.prodManagerImp.update(prodManager);
        assertSame(update,prodManagerImp.update(prodManager));
    }

    @Test
    public void delete() {
        prodManagerImp.delete(prodManager.getPrManName());
    }

    @Test
    public void read() {

        ProdManager read = this.prodManagerImp.read(prodManager.getPrManName());
        assertSame(read, prodManagerImp.read(prodManager.getPrManName()));
    }
}