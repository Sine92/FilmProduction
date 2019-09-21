package za.ac.cput.projects.Services.UnitService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Unit.UnitAssist;
import za.ac.cput.projects.Repositories.UnitRepository.UnitImpRepository.UnitAssImp;
import za.ac.cput.projects.Services.UnitService.UnitAssService;

import java.util.Set;
@Service("UnitAssServiceImpl")
public class UnitAssServiceImpl implements UnitAssService {
    @Autowired
    @Qualifier("UnitAssServiceImpl")
    private UnitAssServiceImpl service = null;
    private UnitAssImp unitAssImp;

    @Override
    public Set<UnitAssist> getAll() {
        return unitAssImp.getAll();
    }

    @Override
    public UnitAssist create(UnitAssist unitAssist) {
        return unitAssImp.create(unitAssist);
    }

    @Override
    public UnitAssist update(UnitAssist unitAssist) {

        return unitAssImp.update(unitAssist);
    }

    @Override
    public void delete(String s) {
        unitAssImp.delete(s);

    }

    @Override
    public UnitAssist read(String s) {
        return unitAssImp.read(s);
    }
}
