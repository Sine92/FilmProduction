package za.ac.cput.projects.Services.GripsService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Grips.KeyGrip;
import za.ac.cput.projects.Repositories.GripsRepository.GripImpRepository.KeyGripImpl;
import za.ac.cput.projects.Services.GripsService.KeyGripService;

import java.util.Set;
@Service("KeyGripServiceImpl")
public class KeyGripServiceImpl implements KeyGripService {
    @Autowired
    @Qualifier("KeyGripServiceImpl")
    private KeyGripServiceImpl service = null;
    private KeyGripImpl keyGripRepo;
    @Override
    public Set<KeyGrip> getAll() {
        return keyGripRepo.getAll();
    }

    @Override
    public KeyGrip create(KeyGrip keyGrip) {
        return keyGripRepo.create(keyGrip);
    }

    @Override
    public KeyGrip update(KeyGrip keyGrip) {
        return keyGripRepo.update(keyGrip);
    }

    @Override
    public void delete(String kdId) {
        keyGripRepo.delete(kdId);

    }

    @Override
    public KeyGrip read(String kdId) {
        return keyGripRepo.read(kdId);
    }
}
