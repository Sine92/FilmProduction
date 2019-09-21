package za.ac.cput.projects.Services.UnitService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Unit.UnitManager;
import za.ac.cput.projects.Repositories.UnitRepository.UnitManRepository;
import za.ac.cput.projects.Services.UnitService.UnitManagerService;

import java.util.Map;
import java.util.Set;

@Service("UnitManagerServiceImpl")
public class UnitManagerServiceImpl implements UnitManagerService {
    @Autowired
    @Qualifier("UnitManagerServiceImpl")
    private UnitManagerServiceImpl service = null;
    private UnitManRepository unitManRepository;
    @Override
    public Set<UnitManager> getAll() {
        return  unitManRepository.getAll();
    }

    @Override
    public UnitManager create(UnitManager unitManager) {

        return unitManRepository.create(unitManager);
    }

    @Override
    public UnitManager update(UnitManager unitManager) {
        return unitManRepository.update(unitManager);
    }

    @Override
    public void delete(String s) {
        unitManRepository.delete(s);

    }

    @Override
    public UnitManager read(String s) {
        return unitManRepository.read(s);
    }
}
