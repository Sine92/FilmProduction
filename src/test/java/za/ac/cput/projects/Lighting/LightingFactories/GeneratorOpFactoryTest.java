package za.ac.cput.projects.Lighting.LightingFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Lighting.GeneratorOp;

import static org.junit.Assert.*;

public class GeneratorOpFactoryTest {
    GeneratorOp generatorOp;
    @Before
    public void setUp() throws Exception {
        generatorOp = GeneratorOpFactory.createGen("Steve","900",687.00);
    }

    @Test
    public void createGen() {
        assertEquals(generatorOp.getGenName(),generatorOp.getGenName());

    }
}