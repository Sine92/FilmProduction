package za.ac.cput.projects.Services.ArtService;

import za.ac.cput.projects.Domain.Art.ArtDirector;
import za.ac.cput.projects.Domain.Art.PropMaster;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface PropMasterService extends IService<PropMaster, String> {
    PropMaster displayBy(String pmRole);
    Set<PropMaster> getAll();
}
