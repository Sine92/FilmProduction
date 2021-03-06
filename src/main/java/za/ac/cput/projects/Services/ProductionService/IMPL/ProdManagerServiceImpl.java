package za.ac.cput.projects.Services.ProductionService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Production.ProdManager;
import za.ac.cput.projects.Repositories.ProductionRepository.ProductionImpRepo.ProdManagerImp;
import za.ac.cput.projects.Services.ProductionService.ProdManagerService;

import java.util.Set;
@Service("ProdManagerServiceImpl")
public class ProdManagerServiceImpl implements ProdManagerService {
    @Autowired
    @Qualifier("ProdManagerServiceImpl")
    private ProdManagerServiceImpl service = null;
    private ProdManagerImp prodManagerImp;
    @Override
    public Set<ProdManager> getAll() {
        return prodManagerImp.getAll();
    }

    @Override
    public ProdManager create(ProdManager prodManager) {
        return prodManagerImp.create(prodManager);
    }

    @Override
    public ProdManager update(ProdManager prodManager) {
        return prodManagerImp.update(prodManager);
    }

    @Override
    public void delete(String prId) {
        prodManagerImp.delete(prId);

    }

    @Override
    public ProdManager read(String prId) {
        return prodManagerImp.read(prId);
    }
}
