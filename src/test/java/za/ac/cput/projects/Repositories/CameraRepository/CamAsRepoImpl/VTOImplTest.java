package za.ac.cput.projects.Repositories.CameraRepository.CamAsRepoImpl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Camera.VTO;
import za.ac.cput.projects.Factories.CamFactories.VTOFactory;

import static org.junit.Assert.*;

public class VTOImplTest {
     private VTO vto;
     private VTOImpl vtoimpl;
    @Before
    public void setUp() throws Exception {
        vtoimpl = VTOImpl.getVtoRepo();
        vto = VTOFactory.createVT("Lennox","777",250.00);
    }

    @Test
    public void getAll() {
        assertEquals(vtoimpl.getAll(),vtoimpl.getAll());
    }

    @Test
    public void create() {
        assertEquals(vtoimpl.create(vto),vtoimpl.create(vto));
    }

    @Test
    public void delete() {
        vtoimpl.delete(vto.getvTName());
    }


    @Test
    public void update() {
        assertEquals(vtoimpl.update(vto),vtoimpl.update(vto));
    }

    @Test
    public void read() {
        assertEquals(vtoimpl.read(vto.getvTName()),vtoimpl.read(vto.getvTName()));
    }
}