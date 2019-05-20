package za.ac.cput.projects.Repositories.ProductionRepository.ProductionImpRepo;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.Production.Producer;
import za.ac.cput.projects.Factories.ProductionFactories.ProducerFactory;

import static org.junit.Assert.*;

public class ProducerImpTest {
    private Producer producer;
    private ProducerImp producerImp;

    @Before
    public void setUp() throws Exception {
        producerImp = ProducerImp.getProducerImp();
        producer = ProducerFactory.createProducer("Di","082",3500.00);
    }

    @Test
    public void getAll() {
        assertEquals(producerImp.getAll(),producerImp.getAll());
    }

    @Test
    public void create() {
        assertEquals(producerImp.create(producer),producerImp.create(producer));
    }

    @Test
    public void delete() {
        producerImp.delete(producer.getProdName());
    }

    @Test
    public void update() {
        assertEquals(producerImp.update(producer),producerImp.update(producer));
    }

    @Test
    public void read() {
        assertEquals(producerImp.read(producer.getProdName()),producerImp.read(producer.getProdName()));
    }
}