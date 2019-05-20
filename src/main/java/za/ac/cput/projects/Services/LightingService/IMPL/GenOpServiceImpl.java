package za.ac.cput.projects.Services.LightingService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Lighting.GeneratorOp;
import za.ac.cput.projects.Repositories.LightingRepository.GenOpRepository;
import za.ac.cput.projects.Repositories.LightingRepository.LightingImpRepository.GenOpImp;
import za.ac.cput.projects.Services.LightingService.GenOpService;

import java.util.Set;
@Service("ServiceImpl")
public class GenOpServiceImpl implements GenOpService {
    @Autowired
    @Qualifier("InMemory")
    private GenOpImp genOpImp;
    @Override
    public Set<GeneratorOp> getAll() {
        return genOpImp.getAll();
    }

    @Override
    public GeneratorOp create(GeneratorOp generatorOp) {
        return genOpImp.create(generatorOp);
    }

    @Override
    public GeneratorOp update(GeneratorOp generatorOp) {
        return genOpImp.update(generatorOp);
    }

    @Override
    public void delete(String s) {
        genOpImp.delete(s);

    }

    @Override
    public GeneratorOp read(String s) {
        return genOpImp.read(s);
    }
}
