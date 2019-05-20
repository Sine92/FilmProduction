package za.ac.cput.projects.Services.LightingService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Lighting.BestBoy;
import za.ac.cput.projects.Repositories.LightingRepository.LightingImpRepository.BestBoyImp;
import za.ac.cput.projects.Services.LightingService.BestBoyService;

import java.util.Set;
@Service("ServiceImpl")
public class BestBoyServiceImpl implements BestBoyService {
    @Autowired
    @Qualifier("InMemory")
    private BestBoyImp bestBoyImp;
    @Override
    public Set<BestBoy> getAll() {
        return bestBoyImp.getAll();
    }

    @Override
    public BestBoy create(BestBoy bestBoy) {
        return bestBoyImp.create(bestBoy);
    }

    @Override
    public BestBoy update(BestBoy bestBoy) {
        return bestBoyImp.update(bestBoy);
    }

    @Override
    public void delete(String s) {
        bestBoyImp.delete(s);

    }

    @Override
    public BestBoy read(String s) {
        return bestBoyImp.read(s);
    }
}
