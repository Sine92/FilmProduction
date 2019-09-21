package za.ac.cput.projects.Services.CameraService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Camera.VTO;
import za.ac.cput.projects.Repositories.CameraRepository.CamAsRepoImpl.VTOImpl;
import za.ac.cput.projects.Services.CameraService.VTOService;

import java.util.Set;
@Service("VTOServiceImpl")
public class VTOServiceImpl implements VTOService {
    @Autowired
    @Qualifier("VTOServiceImpl")
    private VTOServiceImpl service = null;
    private VTOImpl vtoImp;
    @Override
    public Set<VTO> getAll() {
        return vtoImp.getAll();
    }

    @Override
    public VTO create(VTO vto) {
        return vtoImp.create(vto);
    }

    @Override
    public VTO update(VTO vto) {
        return vtoImp.update(vto);
    }

    @Override
    public void delete(String s) {
        vtoImp.delete(s);

    }

    @Override
    public VTO read(String s) {
        return vtoImp.read(s);
    }
}
