package za.ac.cput.projects.Lighting.LightingFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Lighting.Spark;

import static org.junit.Assert.*;

public class SparkFactoryTest {
     Spark spark;
    @Before
    public void setUp() throws Exception {
        spark = SparkFactory.createSpark("Rudi","02100", 500.00);
    }

    @Test
    public void createSpark() {

        assertEquals(spark.getSpName(),spark.getSpName());
    }
}