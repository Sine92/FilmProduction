package za.ac.cput.projects.Services.CameraService.IMPL;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.Domain.Camera.VTO;
import za.ac.cput.projects.Factories.CamFactories.VTOFactory;
import za.ac.cput.projects.Repositories.CameraRepository.CamAsRepoImpl.VTOImpl;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VTOServiceImplTest {
     private VTO vto;
     private VTOImpl vtoImpl;
    @Before
    public void setUp() throws Exception {
        vtoImpl = vtoImpl.getVtoRepo();
        vto = VTOFactory.createVT("Lennox","5620",450.00);
    }

    @Test
    public void getAll() {
        Set<VTO> all = this.vtoImpl.getAll();
        assertSame(all,vtoImpl.getAll());
    }

    @Test
    public void create() {

        VTO create = this.vtoImpl.create(vto);
        assertSame(create,vtoImpl.create(vto));
    }

    @Test
    public void update() {
        VTO update = this.vtoImpl.update(vto);
        assertSame(update, this.vtoImpl.update(vto));
    }

    @Test
    public void delete() {

        vtoImpl.delete(vto.getvTName());
    }

    @Test
    public void read() {

        VTO read = this.vtoImpl.read(vto.getvTName());
        assertSame(read, vtoImpl.read(vto.getvTName()));
    }
}