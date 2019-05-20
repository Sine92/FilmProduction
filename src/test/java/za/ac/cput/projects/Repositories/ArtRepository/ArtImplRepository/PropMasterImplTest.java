package za.ac.cput.projects.Repositories.ArtRepository.ArtImplRepository;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Factories.ArtFactories.PropMasterFactory;
import za.ac.cput.projects.Domain.Art.PropMaster;
import za.ac.cput.projects.Repositories.ArtRepository.PropMasterRepository;

import static org.junit.Assert.*;

public class PropMasterImplTest {
    private PropMasterRepository propMasterRepository;
    private PropMaster propMaster;
    @Before
    public void setUp() throws Exception {
        propMasterRepository = PropMasterImpl.getPropMaster();
        propMaster = PropMasterFactory.createPropMaster("Gar","2636",25.00);
    }

    @Test
    public void create() {
        assertEquals(propMasterRepository.create(propMaster),propMasterRepository.create(propMaster));
    }

    @Test
    public void read() {
        assertEquals(propMasterRepository.read(propMaster.getPropMasterName()),propMasterRepository.read(propMaster.getPropMasterName()));
    }

    @Test
    public void update() {
        assertEquals(propMasterRepository.update(propMaster),propMasterRepository.update(propMaster));
    }

    @Test
    public void delete() {
        propMasterRepository.delete(propMaster.getPropMasterName());
    }

    @Test
    public void getAll() {
        assertEquals(propMasterRepository.getAll(),propMasterRepository.getAll());
    }
}