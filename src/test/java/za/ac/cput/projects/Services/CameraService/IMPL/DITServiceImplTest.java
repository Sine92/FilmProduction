package za.ac.cput.projects.Services.CameraService.IMPL;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.Domain.Camera.DIT;
import za.ac.cput.projects.Factories.CamFactories.DITFactory;
import za.ac.cput.projects.Repositories.CameraRepository.CamAsRepoImpl.DITImpl;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DITServiceImplTest {
   private DITImpl ditImpl;
   private DIT dit;
    @Before
    public void setUp() throws Exception {

ditImpl = DITImpl.getDit();
dit = DITFactory.createDit("Lensoe", "505",560.00);
    }

    @Test
    public void getAll() {

        Set<DIT> all = this.ditImpl.getAll();
        assertSame(all,ditImpl.getAll());
    }

    @Test
    public void create() {

        DIT create = this.ditImpl.create(dit);
        assertSame(create,ditImpl.create(dit));
    }

    @Test
    public void update() {

        DIT update = this.ditImpl.update(dit);
        assertSame(update,ditImpl.update(dit));
    }

    @Test
    public void delete() {
        ditImpl.delete(dit.getDitName());
    }

    @Test
    public void read() {

        DIT read = this.ditImpl.read(dit.getDitName());
        assertSame(read,ditImpl.read(dit.getDitName()));

    }
}