package za.ac.cput.projects.Repositories.LightingRepository.LightingImpRepository;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Lighting.Spark;
import za.ac.cput.projects.Factories.LightingFactories.SparkFactory;

import static org.junit.Assert.*;

public class SparkImpTest {

    private SparkImp sparkImp;
    private Spark spark;
    @Before
    public void setUp() throws Exception {
        sparkImp = SparkImp.getSparkImp();
        spark = SparkFactory.createSpark("Steven","8955",250.00);
    }

    @Test
    public void getAll() {
        assertEquals(sparkImp.getAll(),sparkImp.getAll());
    }

    @Test
    public void create() {
        assertEquals(sparkImp.create(spark),sparkImp.create(spark));
    }

    @Test
    public void delete() {
        sparkImp.delete(spark.getSpName());
    }

    @Test
    public void update() {
        assertEquals(sparkImp.update(spark),sparkImp.update(spark));
    }

    @Test
    public void read() {
        assertEquals(sparkImp.read(spark.getSpName()),sparkImp.read(spark.getSpName()));
    }
}