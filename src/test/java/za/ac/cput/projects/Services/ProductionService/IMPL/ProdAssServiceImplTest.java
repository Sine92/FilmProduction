package za.ac.cput.projects.Services.ProductionService.IMPL;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.Domain.Production.ProductionAssist;
import za.ac.cput.projects.Factories.ProductionFactories.ProductionAssistFactory;
import za.ac.cput.projects.Repositories.ProductionRepository.ProductionImpRepo.ProdAssImp;
import za.ac.cput.projects.Repositories.ProductionRepository.ProductionImpRepo.ProducerImp;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProdAssServiceImplTest {
     private ProductionAssist productionAssist;
     private ProdAssImp prodAssImp;
    @Before
    public void setUp() throws Exception {
        prodAssImp =ProdAssImp.getProdAssImp();
        productionAssist = ProductionAssistFactory.createPA("Athi","562",360.00);
    }

    @Test
    public void getAll() {
        Set<ProductionAssist> all = this.prodAssImp.getAll();
        assertSame(all,prodAssImp.getAll());
    }

    @Test
    public void create() {
        ProductionAssist create = this.prodAssImp.create(productionAssist);
        assertSame(create,prodAssImp.create(productionAssist));
    }

    @Test
    public void update() {

        ProductionAssist update = this.prodAssImp.update(productionAssist);
        assertSame(update,prodAssImp.update(productionAssist));
    }

    @Test
    public void delete() {
        prodAssImp.delete(productionAssist.getPaName());
    }

    @Test
    public void read() {
        ProductionAssist read = this.prodAssImp.read(productionAssist.getPaName());
        assertSame(read,prodAssImp.read(productionAssist.getPaName()));
    }
}