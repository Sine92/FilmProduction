package za.ac.cput.projects.Services.CameraService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Camera.DIT;
import za.ac.cput.projects.Repositories.CameraRepository.CamAsRepoImpl.DITImpl;
import za.ac.cput.projects.Services.CameraService.DITService;

import java.util.Set;
@Service("DITServiceImpl")
public class DITServiceImpl implements DITService {
    @Autowired
    @Qualifier("DITServiceImpl")
    private DITServiceImpl service = null;
    private DITImpl ditImpl;
    @Override
    public Set<DIT> getAll() {
        return ditImpl.getAll();
    }

    @Override
    public DIT create(DIT dit) {
        return ditImpl.create(dit);
    }

    @Override
    public DIT update(DIT dit) {
        return ditImpl.update(dit);
    }

    @Override
    public void delete(String ditId) {
        ditImpl.delete(ditId);

    }

    @Override
    public DIT read(String ditId) {
        return ditImpl.read(ditId);
    }
}
