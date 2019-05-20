package za.ac.cput.projects.Repositories.CameraRepository.CamAsRepoImpl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Camera.FocusPuller;
import za.ac.cput.projects.Factories.CamFactories.FocusPullerFactory;

import static org.junit.Assert.*;

public class FocusPullerImpTest {
    private FocusPullerImp focusPullerImp;
    private FocusPuller focusPuller;

    @Before
    public void setUp() throws Exception {
        focusPullerImp = FocusPullerImp.getFocPullRepo();
        focusPuller = FocusPullerFactory.createFocusP("Zain","696",500.00);
    }

    @Test
    public void getAll() {
        assertEquals(focusPullerImp.getAll(),focusPullerImp.getAll());
    }

    @Test
    public void create() {
        assertEquals(focusPullerImp.create(focusPuller),focusPullerImp.create(focusPuller));
    }

    @Test
    public void delete() {
        System.out.println(focusPuller.getFocusPName());
        focusPullerImp.delete(focusPuller.getFocusPName());
    }

    @Test
    public void update() {
        assertEquals(focusPullerImp.update(focusPuller),focusPullerImp.update(focusPuller));

    }

    @Test
    public void read() {
        assertEquals(focusPullerImp.read(focusPuller.getFocusPName()),focusPullerImp.read(focusPuller.getFocusPName()));
    }
}