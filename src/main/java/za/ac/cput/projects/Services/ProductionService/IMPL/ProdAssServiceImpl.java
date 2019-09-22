package za.ac.cput.projects.Services.ProductionService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Production.ProductionAssist;
import za.ac.cput.projects.Repositories.ProductionRepository.ProductionImpRepo.ProdAssImp;
import za.ac.cput.projects.Services.ProductionService.ProdAssService;

import java.util.Set;
@Service("ProdAssServiceImpl")
public class ProdAssServiceImpl implements ProdAssService {
    @Autowired
    @Qualifier("ProdAssServiceImpl")
    private ProdAssServiceImpl service = null;
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
    public void delete(String paId) {
        prodAssImp.delete(paId);

    }

    @Override
    public ProductionAssist read(String paId) {
        return prodAssImp.read(paId);
    }
}
