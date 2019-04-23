package za.ac.cput.projects.Production.ProductionFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Production.Producer;

import static org.junit.Assert.*;

public class ProducerFactoryTest {
    Producer producer;
    @Before
    public void setUp() throws Exception {
        producer = ProducerFactory.createProducer("Di","082",3500.00);
    }

    @Test
    public void createProducer() {

        assertEquals(producer.getProdName(),producer.getProdName());
    }
}