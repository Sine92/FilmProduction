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
    private Producer findProducer(String prodId)
    {
        return this.producerSet.stream()
                .filter(producer -> producer.getProdId().trim().equals(prodId))
                .findAny()
                .orElse(null);
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
    public void delete(String prodId) {
       Producer toDelete = findProducer(prodId);
       if(toDelete!=null){
           this.producerSet.remove(toDelete);
       }


    }

    @Override
    public Producer update(Producer producer) {
       Producer toUpdate = findProducer(producer.getProdId());
       if(toUpdate!=null){
           this.producerSet.remove(toUpdate);
           return create(producer);
       }
       return null;
    }

    @Override
    public Producer read(String prodId) {
       Producer producer = findProducer(prodId);
       return producer;
    }
}
