package za.ac.cput.projects.Repositories.SoundRepository.SoundImpRepository;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Sound.BoomSwinger;
import za.ac.cput.projects.Factories.SoundFactories.BoomSwingerFactory;
import za.ac.cput.projects.Repositories.SoundRepository.BoomSwingerRepository;

import static org.junit.Assert.*;

public class BoomsingerImpTest {
    private BoomSwingerRepository boomSwingerRepository;
    private BoomSwinger boomSwinger;
    @Before
    public void setUp() throws Exception {

        boomSwingerRepository = BoomsingerImp.getBoomsingerImp();
        boomSwinger = BoomSwingerFactory.createBoomS("Luba","545",26.02);
    }

    @Test
    public void getAll() {
        assertEquals(boomSwingerRepository.getAll(),boomSwingerRepository.getAll());
    }

    @Test
    public void create() {

        assertEquals(boomSwingerRepository.create(boomSwinger),boomSwingerRepository.create(boomSwinger));
    }

    @Test
    public void delete() {

        boomSwingerRepository.delete(boomSwinger.getBsName());
    }

    @Test
    public void update() {
        assertEquals(boomSwingerRepository.update(boomSwinger),boomSwingerRepository.update(boomSwinger));
    }

    @Test
    public void read() {
        assertEquals(boomSwingerRepository.read(boomSwinger.getBsName()),boomSwingerRepository.read(boomSwinger.getBsName()));
    }
}