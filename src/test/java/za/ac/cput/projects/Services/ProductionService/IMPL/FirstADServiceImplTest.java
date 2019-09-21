package za.ac.cput.projects.Services.ProductionService.IMPL;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.Domain.Production.FirstAD;
import za.ac.cput.projects.Factories.ProductionFactories.FirstADFactory;
import za.ac.cput.projects.Repositories.ProductionRepository.ProductionImpRepo.FirstADImp;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FirstADServiceImplTest {
    private FirstAD firstAD;
    private FirstADImp firstADImp;
    @Before
    public void setUp() throws Exception {
        firstADImp = FirstADImp.getFirstADImp();
        firstAD = FirstADFactory.createFD("GReg", "2202",530.00);
    }

    @Test
    public void getAll() {
       Set<FirstAD> all = firstADImp.getAll();
       assertSame(all,firstADImp.getAll());
    }

    @Test(expected = NullPointerException.class)
    public void create() {

        FirstAD create = this.firstADImp.create(firstAD);
        assertSame(create, firstADImp.create(firstAD));
    }

    @Test(expected = NullPointerException.class)
    public void update() {

        FirstAD update = this.firstADImp.update(firstAD);
        assertSame(update,this.firstADImp.update(firstAD));
    }

    @Test(expected = NullPointerException.class)
    public void delete() {
        firstADImp.delete(firstAD.getfAdName());
    }

    @Test(expected = NullPointerException.class)
    public void read() {

        FirstAD read =this.firstADImp.read(firstAD.getfAdName());
    }
}