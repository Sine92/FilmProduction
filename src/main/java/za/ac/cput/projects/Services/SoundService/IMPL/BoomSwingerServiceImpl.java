package za.ac.cput.projects.Services.SoundService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Sound.BoomSwinger;
import za.ac.cput.projects.Repositories.SoundRepository.SoundImpRepository.BoomsingerImp;
import za.ac.cput.projects.Services.SoundService.BoomSwingerService;

import java.util.Set;
@Service("ServiceImpl")
public class BoomSwingerServiceImpl implements BoomSwingerService {
    @Autowired
    @Qualifier("InMemory")
    private BoomsingerImp boomsingerImp;
    @Override
    public Set<BoomSwinger> getAll() {
        return boomsingerImp.getAll();
    }

    @Override
    public BoomSwinger create(BoomSwinger boomSwinger) {
        return boomsingerImp.create(boomSwinger);
    }

    @Override
    public BoomSwinger update(BoomSwinger boomSwinger) {
        return boomsingerImp.update(boomSwinger);
    }

    @Override
    public void delete(String s) {
        boomsingerImp.delete(s);

    }

    @Override
    public BoomSwinger read(String s) {
        return boomsingerImp.read(s);
    }
}
