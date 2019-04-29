package za.ac.cput.projects.UnitRepository.UnitImpRepository;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Unit.Medic;
import za.ac.cput.projects.Unit.UnitFactories.MedicFactory;
import za.ac.cput.projects.UnitRepository.MedicRepository;

import static org.junit.Assert.*;

public class MedicImpTest {
    private MedicRepository medicRepository;
    private Medic medic;
    @Before
    public void setUp() throws Exception {
        medicRepository = MedicImp.getMedicImp();
        medic = MedicFactory.createMedic("Donald","036",360.00);
    }


    @Test
    public void create() {

        assertEquals(medicRepository.create(medic),medicRepository.create(medic));

    }

    @Test
    public void delete() {
        medicRepository.delete(medic.getMedName());
    }

    @Test
    public void update() {
        assertEquals(medicRepository.update(medic),medicRepository.update(medic));
    }

    @Test
    public void read() {
        assertEquals(medicRepository.read(medic),medicRepository.read(medic));
    }
}