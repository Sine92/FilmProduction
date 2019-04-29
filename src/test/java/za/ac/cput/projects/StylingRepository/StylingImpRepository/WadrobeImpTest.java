package za.ac.cput.projects.StylingRepository.StylingImpRepository;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Styling.StylingFactories.WadrobeFactory;
import za.ac.cput.projects.Styling.Wadrobe;
import za.ac.cput.projects.StylingRepository.WardropRepository;

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
        assertEquals(wardropRepository.read(wadrobe),wardropRepository.read(wadrobe));
    }


}