package za.ac.cput.projects.Repositories.GripsRepository.GripImpRepository;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Grips.KeyGrip;
import za.ac.cput.projects.Factories.GripFactories.KeyGripFactory;

import static org.junit.Assert.*;

public class KeyGripImplTest {

    private KeyGripImpl keyGripRepo;
    private KeyGrip keyGripdomain;
    @Before
    public void setUp() throws Exception {

        keyGripRepo = KeyGripImpl.getKeyGrip();
        keyGripdomain = KeyGripFactory.createKey("Kenn","021",500.00);
    }

    @Test
    public void getAll() {

        assertEquals(keyGripRepo.getAll(),keyGripRepo.getAll());
    }

    @Test
    public void create() {
        assertEquals(keyGripRepo.create(keyGripdomain),keyGripRepo.create(keyGripdomain));
    }

    @Test
    public void delete() {
        this.keyGripRepo.delete(keyGripdomain.getKgName());
    }

    @Test
    public void update() {
        assertEquals(keyGripRepo.update(keyGripdomain),keyGripRepo.update(keyGripdomain));
    }

    @Test
    public void read() {
        assertEquals(keyGripRepo.read(keyGripdomain.getKgName()),keyGripRepo.read(keyGripdomain.getKgName()));
    }
}