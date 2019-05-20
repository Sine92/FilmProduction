package za.ac.cput.projects.Repositories.LightingRepository.LightingImpRepository;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Lighting.GeneratorOp;
import za.ac.cput.projects.Factories.LightingFactories.GeneratorOpFactory;

import static org.junit.Assert.*;

public class GenOpImpTest {

    private GenOpImp genOpImp;
    private GeneratorOp generatorOp;
    @Before
    public void setUp() throws Exception {
        genOpImp = GenOpImp.getGenOpImp();
        generatorOp = GeneratorOpFactory.createGen("Man","266",420.00);
    }

    @Test
    public void getAll() {
        assertEquals(genOpImp.getAll(),genOpImp.getAll());
    }

    @Test
    public void create() {
        assertEquals(genOpImp.create(generatorOp),genOpImp.create(generatorOp));
    }

    @Test
    public void delete() {
        genOpImp.delete(generatorOp.getGenName());
    }

    @Test
    public void update() {
        assertEquals(genOpImp.update(generatorOp),genOpImp.update(generatorOp));
    }

    @Test
    public void read() {
        assertEquals(genOpImp.read(generatorOp.getGenName()),genOpImp.read(generatorOp.getGenName()));
    }
}