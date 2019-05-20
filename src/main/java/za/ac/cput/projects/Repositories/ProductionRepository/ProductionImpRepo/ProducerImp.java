package za.ac.cput.projects.Repositories.ProductionRepository.ProductionImpRepo;

import za.ac.cput.projects.Domain.Production.Producer;
import za.ac.cput.projects.Repositories.ProductionRepository.ProducerRepo;

import java.util.Set;

public class ProducerImp implements ProducerRepo {

    private static ProducerImp producerImp = null;
    private Set<Producer> producerSet;
    public static ProducerImp getProducerImp()
    {
        if(producerImp == null) producerImp = new ProducerImp();
        return producerImp;
    }

    @Override
    public Set<Producer> getAll() {
        return producerSet;
    }

    @Override
    public Producer create(Producer producer) {

        this.producerSet.add(producer);
        return producer;
    }

    @Override
    public void delete(String s) {
        producerSet.removeIf(t->t.getProdName().equals(s));


    }

    @Override
    public Producer update(Producer producer) {

        if(producerSet.contains(producer))
        {
            for(Producer producer1: producerSet)
            {
                if(producer1.equals(producer))
                {
                    return producer1;
                }
            }
        }
        return null;
    }

    @Override
    public Producer read(String s) {
        if(producerImp.producerSet.contains(s))
        {
            for(Producer producer1: producerSet)
            {
                if(producer1.equals(s))
                {
                    return producer1;
                }
            }
        }
        return null;
    }
}