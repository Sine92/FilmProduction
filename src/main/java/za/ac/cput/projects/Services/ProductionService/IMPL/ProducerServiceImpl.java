package za.ac.cput.projects.Services.ProductionService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Production.Producer;
import za.ac.cput.projects.Repositories.ProductionRepository.ProductionImpRepo.ProducerImp;
import za.ac.cput.projects.Services.ProductionService.ProducerService;

import java.util.Set;
@Service("ProducerServiceImpl")
public class ProducerServiceImpl implements ProducerService {
    @Autowired
    @Qualifier("ProducerServiceImpl")
    private ProducerServiceImpl service = null;
    private ProducerImp producerImp;
    @Override
    public Set<Producer> getAll() {
        return producerImp.getAll();
    }

    @Override
    public Producer create(Producer producer) {
        return producerImp.create(producer);
    }

    @Override
    public Producer update(Producer producer) {
        return producerImp.update(producer);
    }

    @Override
    public void delete(String prodId) {
        producerImp.delete(prodId);

    }

    @Override
    public Producer read(String prodId) {
        return producerImp.read(prodId);
    }
}
