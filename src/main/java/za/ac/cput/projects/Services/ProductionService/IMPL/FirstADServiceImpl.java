package za.ac.cput.projects.Services.ProductionService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Production.FirstAD;
import za.ac.cput.projects.Repositories.ProductionRepository.ProductionImpRepo.FirstADImp;
import za.ac.cput.projects.Services.ProductionService.FirstADService;

import java.util.Set;
@Service("FirstADServiceImpl")
public class FirstADServiceImpl implements FirstADService {
    @Autowired
    @Qualifier("FirstADServiceImpl")
    private FirstADServiceImpl service = null;
    private FirstADImp firstADImp;
    @Override
    public Set<FirstAD> getAll() {
        return firstADImp.getAll();
    }

    @Override
    public FirstAD create(FirstAD firstAD) {
        return firstADImp.create(firstAD);
    }

    @Override
    public FirstAD update(FirstAD firstAD) {
        return firstADImp.update(firstAD);
    }

    @Override
    public void delete(String spId) {
        firstADImp.delete(spId);

    }

    @Override
    public FirstAD read(String spId) {
        return firstADImp.read(spId);
    }
}
