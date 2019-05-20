package za.ac.cput.projects.Repositories.CameraRepository.CamAsRepoImpl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Camera.CamAssistant;
import za.ac.cput.projects.Factories.CamFactories.CamAssistFactory;
import za.ac.cput.projects.Repositories.CameraRepository.CamAsRepository;

import static org.junit.Assert.*;

public class CamAssistantImpTest {
    private CamAsRepository camAsRepository;
    private CamAssistant camAssistant;
    @Before
    public void setUp() throws Exception {
        camAsRepository = CamAssistantImp.getCamRepo();
        camAssistant = CamAssistFactory.createCamAss("lk","302",200.00);
    }

    @Test
    public void getAll() {
        assertEquals(camAsRepository.getAll(),camAsRepository.getAll());
    }

    @Test
    public void create() {

    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
    }

    @Test
    public void read() {
    }
}