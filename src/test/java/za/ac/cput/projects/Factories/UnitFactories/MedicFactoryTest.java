package za.ac.cput.projects.Factories.UnitFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Unit.Medic;

import static org.junit.Assert.*;

public class MedicFactoryTest {
    Medic medic;

    @Before
    public void setUp() throws Exception {
        medic = MedicFactory.createMedic("Darren", "043", 750.00);
    }


    @Test
    public void createMedic() {

        assertEquals(medic.getMedName(), medic.getMedName());


    }
}