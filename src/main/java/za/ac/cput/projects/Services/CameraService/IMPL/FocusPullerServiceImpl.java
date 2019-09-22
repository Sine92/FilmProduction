package za.ac.cput.projects.Services.CameraService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Camera.FocusPuller;
import za.ac.cput.projects.Repositories.CameraRepository.CamAsRepoImpl.FocusPullerImp;
import za.ac.cput.projects.Services.CameraService.FocusPullerService;

import java.util.Set;
@Service("FocusPullerServiceImpl")
public class FocusPullerServiceImpl implements FocusPullerService {
    @Autowired
    @Qualifier("FocusPullerServiceImpl")
    private FocusPullerServiceImpl service = null;
    private FocusPullerImp focusPullerImp;
    @Override
    public Set<FocusPuller> getAll() {
        return focusPullerImp.getAll();
    }

    @Override
    public FocusPuller create(FocusPuller focusPuller) {
        return focusPullerImp.create(focusPuller);
    }

    @Override
    public FocusPuller update(FocusPuller focusPuller) {
        return focusPullerImp.update(focusPuller);
    }

    @Override
    public void delete(String focusPullerId) {
        focusPullerImp.delete(focusPullerId);

    }

    @Override
    public FocusPuller read(String focusPullerId) {
        return focusPullerImp.read(focusPullerId);
    }
}
