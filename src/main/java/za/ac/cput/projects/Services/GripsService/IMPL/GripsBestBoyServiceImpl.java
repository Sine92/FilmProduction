package za.ac.cput.projects.Services.GripsService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Grips.GripBestBoy;
import za.ac.cput.projects.Repositories.GripsRepository.GripImpRepository.GripsBestBoyImp;
import za.ac.cput.projects.Services.GripsService.GripBestBoyService;

import java.util.Set;
@Service("GripsBestBoyServiceImpl")
public class GripsBestBoyServiceImpl implements GripBestBoyService {
    @Autowired
    @Qualifier("GripsBestBoyServiceImpl")
    private GripsBestBoyServiceImpl service = null;
    private GripsBestBoyImp gripsBestBoyImp;
    @Override
    public Set<GripBestBoy> getAll() {
        return gripsBestBoyImp.getAll();
    }

    @Override
    public GripBestBoy create(GripBestBoy gripBestBoy) {
        return gripsBestBoyImp.create(gripBestBoy);
    }

    @Override
    public GripBestBoy update(GripBestBoy gripBestBoy) {
        return gripsBestBoyImp.update(gripBestBoy);
    }

    @Override
    public void delete(String s) {
        gripsBestBoyImp.delete(s);

    }

    @Override
    public GripBestBoy read(String s) {
        return gripsBestBoyImp.read(s);
    }
}
