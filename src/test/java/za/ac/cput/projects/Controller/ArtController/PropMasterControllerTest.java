package za.ac.cput.projects.Controller.ArtController;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import za.ac.cput.projects.Domain.Art.PropMaster;
import za.ac.cput.projects.Domain.Art.Props;
import za.ac.cput.projects.Factories.ArtFactories.PropMasterFactory;
import za.ac.cput.projects.Repositories.ArtRepository.ArtImplRepository.ArtRepoImpl;
import za.ac.cput.projects.Repositories.ArtRepository.ArtImplRepository.PropMasterImpl;
import za.ac.cput.projects.Services.ArtService.ArtDirectService;
import za.ac.cput.projects.Services.ArtService.IMPL.PropMasterServiceImpl;
import za.ac.cput.projects.Services.ArtService.PropMasterService;

import static org.junit.Assert.*;


public class PropMasterControllerTest {

    private PropMasterController propMasterController;
    private PropMasterServiceImpl propMasterService;
    private PropMasterImpl propMasterRepo;
    private PropMaster propMaster;
    //private PropMasterImpl propMasterRepo

    @Before
    public void setUp() throws Exception {

       propMasterController = new PropMasterController();
        propMasterRepo = PropMasterImpl.getPropMaster();
        propMaster = PropMasterFactory.createPropMaster("Abu","256",450.00);
    }

    @Test
    public void create() {

        assertSame(propMasterRepo.create(propMaster),propMasterRepo.create(propMaster));
    }

    @Test
    public void update() {

        assertSame(propMasterRepo.update(propMaster),propMasterRepo.update(propMaster));
    }

    @Test
    public void delete() {
        propMasterRepo.delete(propMaster.getPropMasterName());
    }

    @Test
    public void read() {
        assertEquals(propMasterRepo.read(propMaster.getPropMasterName()),propMasterRepo.read(propMaster.getPropMasterName()));
    }

    @Test(expected = NullPointerException.class)
    public void getAll() {
       // propMasterController.getAll().contains(propMaster);


        //propMasterController = new PropMasterController().getAll().add(propMaster.getPropMasterName().contains(getAll()));
        assertSame(propMasterService.getAll(),propMasterService.getAll());
    }
}