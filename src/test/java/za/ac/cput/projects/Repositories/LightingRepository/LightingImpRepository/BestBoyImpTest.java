package za.ac.cput.projects.Repositories.LightingRepository.LightingImpRepository;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Lighting.BestBoy;
import za.ac.cput.projects.Factories.LightingFactories.BestBoyFactory;

import static org.junit.Assert.*;

public class BestBoyImpTest {

    private BestBoyImp bestBoyImp;
    private BestBoy  bestBoy;
    @Before
    public void setUp() throws Exception {
        bestBoyImp = BestBoyImp.getBestBoyImp();
        bestBoy = BestBoyFactory.createBest("Abu","555",200.00);
    }

    @Test
    public void getAll() {
        assertEquals(bestBoyImp.getAll(),bestBoyImp.getAll());
    }

    @Test
    public void create() {
        assertEquals(bestBoyImp.create(bestBoy),bestBoyImp.create(bestBoy));
    }

    @Test
    public void delete() {
        bestBoyImp.delete(bestBoy.getBbName());
    }

    @Test
    public void update() {
        assertEquals(bestBoyImp.update(bestBoy),bestBoyImp.update(bestBoy));
    }

    @Test
    public void read() {
        assertEquals(bestBoyImp.read(bestBoy.getBbName()),bestBoyImp.read(bestBoy.getBbName()));
    }
}