package za.ac.cput.projects.Repositories.StylingRepository.StylingImpRepository;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Factories.StylingFactories.WadrobeFactory;
import za.ac.cput.projects.Domain.Styling.Wadrobe;
import za.ac.cput.projects.Repositories.StylingRepository.WardropRepository;

import static org.junit.Assert.*;

public class WadrobeImpTest {

    private WardropRepository wardropRepository;
    private Wadrobe wadrobe;
    @Before
    public void setUp() throws Exception {

        wardropRepository = WadrobeImp.getWadrobeImp();
        wadrobe = WadrobeFactory.createWadrop("Carthy","032",500.00);
    }
    @Test
    public void getAll() {
        assertEquals(wardropRepository.getAll(),wardropRepository.getAll());
    }

    @Test
    public void create() {
        assertEquals(wardropRepository.create(wadrobe),wardropRepository.create(wadrobe));

    }

    @Test
    public void delete() {
        wardropRepository.delete(wadrobe.getWadName());
    }

    @Test
    public void update() {

        assertEquals(wardropRepository.update(wadrobe),wardropRepository.update(wadrobe));
    }

    @Test
    public void read() {
        assertEquals(wardropRepository.read(wadrobe.getWadName()),wardropRepository.read(wadrobe.getWadName()));
    }


}