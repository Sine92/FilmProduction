package za.ac.cput.projects.Repositories.LightingRepository.LightingImpRepository;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Lighting.Gaffer;
import za.ac.cput.projects.Factories.LightingFactories.GafferFactory;

import static org.junit.Assert.*;

public class GafferImpTest {

    private GafferImp gafferImp;
    private Gaffer gaffer;
    @Before
    public void setUp() throws Exception {
        gafferImp = GafferImp.getGafferImp();
        gaffer = GafferFactory.createGaf("Bennie","8080",750.20);
    }
    @Test
    public void getAll() {
        assertEquals(gafferImp.getAll(),gafferImp.getAll());
    }

    @Test
    public void create() {
        assertEquals(gafferImp.create(gaffer),gafferImp.create(gaffer));
    }

    @Test
    public void delete() {
        gafferImp.delete(gaffer.getGafName());
    }

    @Test
    public void update() {
        assertEquals(gafferImp.update(gaffer),gafferImp.update(gaffer));
    }

    @Test
    public void read() {
        assertEquals(gafferImp.read(gaffer.getGafName()),gafferImp.read(gaffer.getGafName()));
    }


}