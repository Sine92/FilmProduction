package za.ac.cput.projects.Services.CameraService.IMPL;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.Domain.Camera.CamAssistant;
import za.ac.cput.projects.Factories.CamFactories.CamAssistFactory;
import za.ac.cput.projects.Repositories.CameraRepository.CamAsRepoImpl.CamAssistantImp;
import za.ac.cput.projects.Services.CameraService.CamAssService;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CamAssServiceImplTest {
    private CamAssistantImp camAssistantImp;
    private CamAssistant camAssistant;
    @Before
    public void setUp() throws Exception {
        camAssistantImp = CamAssistantImp.getCamRepo();
        camAssistant = CamAssistFactory.createCamAss("Tayler","525",50.00);
    }

    @Test
    public void getAll() {

        Set<CamAssistant> all = this.camAssistantImp.getAll();
        assertSame(all,camAssistantImp.getAll());
    }

    @Test
    public void create() {

        CamAssistant create = this.camAssistantImp.create(camAssistant);
        assertSame(create, camAssistantImp.create(camAssistant));
    }

    @Test
    public void update() {

        CamAssistant update = this.camAssistantImp.update(camAssistant);
        assertSame(update, camAssistantImp.update(camAssistant));
    }

    @Test
    public void delete() {
        camAssistantImp.delete(camAssistant.getCamAssistName());
    }

    @Test
    public void read() {

        CamAssistant read = this.camAssistantImp.read(camAssistant.getCamAssistName());
        assertSame(read,camAssistantImp.read(camAssistant.getCamAssistName()));
    }
}