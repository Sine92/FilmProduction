package za.ac.cput.projects.Services.CameraService.IMPL;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.Domain.Camera.FocusPuller;
import za.ac.cput.projects.Factories.CamFactories.FocusPullerFactory;
import za.ac.cput.projects.Repositories.CameraRepository.CamAsRepoImpl.FocusPullerImp;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FocusPullerServiceImplTest {
     private FocusPuller focusPuller;
     private FocusPullerImp focusPullerImp;
    @Before
    public void setUp() throws Exception {
        focusPullerImp = FocusPullerImp.getFocPullRepo();
        focusPuller = FocusPullerFactory.createFocusP("Zain","4554",700.00);
    }

    @Test
    public void getAll() {
        Set<FocusPuller> all = this.focusPullerImp.getAll();
        assertSame(all,focusPullerImp.getAll());
    }

    @Test
    public void create() {


        FocusPuller create = this.focusPullerImp.create(focusPuller);
        assertSame(create,focusPullerImp.create(focusPuller));
    }

    @Test
    public void update() {

        FocusPuller update = this.focusPullerImp.update(focusPuller);
        assertSame(update,focusPullerImp.update(focusPuller));
    }

    @Test
    public void delete() {
        focusPullerImp.delete(focusPuller.getFocusPName());
    }

    @Test
    public void read() {

        FocusPuller read = this.focusPullerImp.read(focusPuller.getFocusPName());
        assertSame(read,focusPullerImp.read(focusPuller.getFocusPName()));
    }
}