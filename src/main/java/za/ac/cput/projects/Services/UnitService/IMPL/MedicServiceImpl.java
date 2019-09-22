package za.ac.cput.projects.Services.UnitService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Unit.Medic;
import za.ac.cput.projects.Repositories.UnitRepository.UnitImpRepository.MedicImp;
import za.ac.cput.projects.Services.UnitService.MedicService;

import java.util.Set;
@Service("MedicServiceImpl")
public class MedicServiceImpl implements MedicService {
    @Autowired
    @Qualifier("MedicServiceImpl")
    private MedicServiceImpl service = null;
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
    public void delete(String medId) {
        medicImp.delete(medId);

    }

    @Override
    public Medic read(String medId) {
        return medicImp.read(medId);
    }
}
