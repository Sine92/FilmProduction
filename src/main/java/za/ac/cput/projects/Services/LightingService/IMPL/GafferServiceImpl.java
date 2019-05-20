package za.ac.cput.projects.Services.LightingService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Lighting.Gaffer;
import za.ac.cput.projects.Repositories.LightingRepository.LightingImpRepository.GafferImp;
import za.ac.cput.projects.Services.LightingService.GafferService;

import java.util.Set;
@Service("ServiceImpl")
public class GafferServiceImpl implements GafferService {
    @Autowired
    @Qualifier("InMemory")
    private GafferImp gafferImp;
    @Override
    public Set<Gaffer> getAll() {
        return gafferImp.getAll();
    }

    @Override
    public Gaffer create(Gaffer gaffer) {
        return gafferImp.create(gaffer);
    }

    @Override
    public Gaffer update(Gaffer gaffer) {
        return gafferImp.update(gaffer);
    }

    @Override
    public void delete(String s) {
        gafferImp.delete(s);

    }

    @Override
    public Gaffer read(String s) {
        return gafferImp.read(s);
    }
}
