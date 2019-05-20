package za.ac.cput.projects.Services.ProductionService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Production.ProductionAssist;
import za.ac.cput.projects.Repositories.ProductionRepository.ProductionImpRepo.ProdAssImp;
import za.ac.cput.projects.Services.ProductionService.ProdAssService;

import java.util.Set;
@Service("ServiceImpl")
public class ProdAssServiceImpl implements ProdAssService {
    @Autowired
    @Qualifier("InMemory")
    private ProdAssImp prodAssImp;
    @Override
    public Set<ProductionAssist> getAll() {
        return prodAssImp.getAll();
    }

    @Override
    public ProductionAssist create(ProductionAssist productionAssist) {
        return prodAssImp.create(productionAssist);
    }

    @Override
    public ProductionAssist update(ProductionAssist productionAssist) {
        return prodAssImp.update(productionAssist);
    }

    @Override
    public void delete(String s) {
        prodAssImp.delete(s);

    }

    @Override
    public ProductionAssist read(String s) {
        return prodAssImp.read(s);
    }
}
