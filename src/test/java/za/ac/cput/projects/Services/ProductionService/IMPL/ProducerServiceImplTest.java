package za.ac.cput.projects.Services.ProductionService.IMPL;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.Domain.Production.Producer;
import za.ac.cput.projects.Factories.ProductionFactories.ProducerFactory;
import za.ac.cput.projects.Repositories.ProductionRepository.ProductionImpRepo.ProducerImp;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProducerServiceImplTest {
  private ProducerImp producerImp;
  private Producer producer;
    @Before
    public void setUp() throws Exception {
        producerImp = ProducerImp.getProducerImp();
        producer = ProducerFactory.createProducer("Kirst", "526",650.00);
    }

    @Test
    public void getAll() {
        Set<Producer> all = producerImp.getAll();
        assertSame(all,this.producerImp.getAll());
    }

    @Test
    public void create() {

        Producer create = producerImp.create(producer);
        assertSame(create,this.producerImp.create(producer));
    }

    @Test
    public void update() {
        Producer update = producerImp.update(producer);
        assertSame(update,this.producerImp.update(producer));
    }

    @Test
    public void delete() {
        producerImp.delete(producer.getProdName());
    }

    @Test
    public void read() {
        Producer read = producerImp.read(producer.getProdName());
        assertSame(read,producerImp.read(producer.getProdName()));
    }
}