package za.ac.cput.projects.Repositories.CameraRepository.CamAsRepoImpl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Camera.DIT;
import za.ac.cput.projects.Factories.CamFactories.DITFactory;

import static org.junit.Assert.*;

public class DITImplTest {

    private DITImpl ditImpl;
    private DIT dit;
    @Before
    public void setUp() throws Exception {
        ditImpl = DITImpl.getDit();
        dit = DITFactory.createDit("Paul","8878",052.20);
    }

    @Test
    public void getAll() {
        assertEquals(ditImpl.getAll(),ditImpl.getAll());
    }

    @Test
    public void create() {
        assertEquals(ditImpl.create(dit),ditImpl.create(dit));
    }

    @Test
    public void delete() {
        ditImpl.delete(dit.getDitName());
    }

    @Test
    public void update() {
        assertEquals(ditImpl.update(dit),ditImpl.update(dit));
    }

    @Test
    public void read() {
        assertEquals(ditImpl.read(dit.getDitName()),ditImpl.read(dit.getDitName()));
    }
}