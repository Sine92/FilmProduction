package za.ac.cput.projects.Repositories.GripsRepository.GripImpRepository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.Domain.Grips.GripBestBoy;
import za.ac.cput.projects.Factories.GripFactories.GripBestBoyFactory;
import za.ac.cput.projects.Repositories.GripsRepository.GripBoyRepository;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class GripsBestBoyImpTest {


    private GripBoyRepository gripBoyRepository;
    private GripBestBoy gripsBestBoy;


    @Before
    public void setUp() throws Exception {

        this.gripBoyRepository = GripsBestBoyImp.getGripsBestBoyImp();
        this.gripsBestBoy = GripBestBoyFactory.createGrip("Leon","2563",200.00);
    }

    @Test
    public void create() {

        assertEquals(gripBoyRepository.create(gripsBestBoy),gripBoyRepository.create(gripsBestBoy));

    }

    @Test
    public void delete() {

       gripBoyRepository.delete(gripsBestBoy.getGbName());
    }

    @Test
    public void update() {
        assertEquals(gripBoyRepository.update(gripsBestBoy),gripBoyRepository.update(gripsBestBoy));
    }

    @Test
    public void read() {

        assertEquals(gripBoyRepository.read(gripsBestBoy.getGbName()),gripBoyRepository.read(gripsBestBoy.getGbName()));


    }


    @Test
    public void getAll() {
        Set<GripBestBoy> all = this.gripBoyRepository.getAll();
        System.out.println("All is "+all);
        assertEquals(gripBoyRepository.getAll(),gripBoyRepository.getAll());
    }
}