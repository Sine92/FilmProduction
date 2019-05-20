package za.ac.cput.projects.Repositories.ProductionRepository.ProductionImpRepo;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Camera.FocusPuller;
import za.ac.cput.projects.Repositories.CameraRepository.FocusPullerRepository;
import za.ac.cput.projects.Domain.Production.FirstAD;
import za.ac.cput.projects.Factories.ProductionFactories.FirstADFactory;
import za.ac.cput.projects.Repositories.ProductionRepository.FirtADRepo;

import static org.junit.Assert.*;

public class FirstADImpTest {
    private FirtADRepo firtADRepo;
    private FirstAD firstAD;
    @Before
    public void setUp() throws Exception {
        firtADRepo = FirstADImp.getFirstADImp();
        firstAD = FirstADFactory.createFD("Gray","125",3650.00);
    }

    @Test
    public void getAll() {

        assertEquals(firtADRepo.getAll(),firtADRepo.getAll());
    }

    @Test
    public void create() {
        assertEquals(firtADRepo.create(firstAD),firtADRepo.create(firstAD));
    }

    @Test
    public void delete() {
        firtADRepo.delete(firstAD.getfAdName());
    }

    @Test
    public void update() {
        assertEquals(firtADRepo.update(firstAD),firtADRepo.update(firstAD));
    }

    @Test
    public void read() {
        assertEquals(firtADRepo.read(firstAD.getfAdName()),firtADRepo.read(firstAD.getfAdName()));
    }
}