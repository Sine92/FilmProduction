package za.ac.cput.projects.Repositories.UnitRepository.UnitImpRepository;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Unit.UnitAssist;
import za.ac.cput.projects.Factories.UnitFactories.UnitAssistFactory;
import za.ac.cput.projects.Repositories.UnitRepository.UnitAsRepository;

import static org.junit.Assert.*;

public class UnitAssImpTest {

    private UnitAsRepository unitAsRepository;
    private UnitAssist unitAssist;
    @Before
    public void setUp() throws Exception {
        unitAsRepository = UnitAssImp.getUnitAssImp();
        unitAssist = UnitAssistFactory.createUnit("Nko","0173",100.00);

    }

    @Test
    public void getAll() {

        assertEquals(unitAsRepository.getAll(),unitAsRepository.getAll());
    }

    @Test
    public void create() {
        assertEquals(unitAsRepository.create(unitAssist),unitAsRepository.create(unitAssist));
    }

    @Test
    public void delete() {

        unitAsRepository.delete(unitAssist.getUnName());
    }

    @Test
    public void update() {
        assertEquals(unitAsRepository.update(unitAssist),unitAsRepository.update(unitAssist));
    }

    @Test
    public void read() {
        assertEquals(unitAsRepository.read(unitAssist.getUnName()),unitAsRepository.read(unitAssist.getUnName()));
    }
}