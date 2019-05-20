package za.ac.cput.projects.Services.UnitService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Unit.Medic;
import za.ac.cput.projects.Repositories.UnitRepository.UnitImpRepository.MedicImp;
import za.ac.cput.projects.Services.UnitService.MedicService;

import java.util.Set;
@Service("ServiceImpl")
public class MedicServiceImpl implements MedicService {
    @Autowired
    @Qualifier("InMemory")
    private MedicImp medicImp;
    @Override
    public Set<Medic> getAll() {
        return medicImp.getAll();
    }

    @Override
    public Medic create(Medic medic) {
        return medicImp.create(medic);
    }

    @Override
    public Medic update(Medic medic) {
        return medicImp.update(medic);
    }

    @Override
    public void delete(String s) {
        medicImp.delete(s);

    }

    @Override
    public Medic read(String s) {
        return medicImp.read(s);
    }
}
