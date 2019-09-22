package za.ac.cput.projects.Services.ArtService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Art.PropMaster;
import za.ac.cput.projects.Repositories.ArtRepository.ArtImplRepository.PropMasterImpl;
import za.ac.cput.projects.Services.ArtService.PropMasterService;

import java.util.Set;

@Service("PropMasterServiceImpl")
public class PropMasterServiceImpl implements PropMasterService {


    @Autowired

    //@Qualifier("PropMasterServiceImpl")
    private  PropMasterServiceImpl service = null;
    private PropMasterImpl propMasterRepo;

    @Override
    public Set<PropMaster> getAll() {
        return propMasterRepo.getAll();
    }

    @Override
    public PropMaster create(PropMaster propMaster) {
        return propMasterRepo.create(propMaster);
    }

    @Override
    public PropMaster update(PropMaster propMaster) {
        return propMasterRepo.update(propMaster);
    }

    @Override
    public void delete(String propMasterId) {
        propMasterRepo.delete(propMasterId);

    }

    @Override
    public PropMaster read(String propMasterId) {
        return propMasterRepo.read(propMasterId);
    }
}
