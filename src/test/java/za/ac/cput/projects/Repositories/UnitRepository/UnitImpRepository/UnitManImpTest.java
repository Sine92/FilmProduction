package za.ac.cput.projects.Repositories.UnitRepository.UnitImpRepository;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Factories.UnitFactories.UnitManagerFactory;
import za.ac.cput.projects.Domain.Unit.UnitManager;
import za.ac.cput.projects.Repositories.UnitRepository.UnitManRepository;

import static org.junit.Assert.*;

public class UnitManImpTest {
    private UnitManRepository unitManRepository;
   private  UnitManager unitManager;
    @Before
    public void setUp() throws Exception {
        unitManRepository = UnitManImp.getUnitManImp();
        unitManager = UnitManagerFactory.createUnitManager("Isaac","012",350.00);
    }

    @Test
    public void getUnitManImp() {

    }

    @Test
    public void getAll() {
        assertEquals(unitManRepository.getAll(),unitManRepository.getAll());
    }

    @Test
    public void create() {
        assertEquals(unitManRepository.create(unitManager),unitManRepository.create(unitManager));
    }

    @Test
    public void delete() {

        unitManRepository.delete(unitManager.getUnMName());

    }

    @Test
    public void update() {

        assertEquals(unitManRepository.update(unitManager),unitManRepository.update(unitManager));
    }

    @Test
    public void read() {

        assertEquals(unitManRepository.read(unitManager.getUnMName()),unitManRepository.read(unitManager.getUnMName()));
    }
}