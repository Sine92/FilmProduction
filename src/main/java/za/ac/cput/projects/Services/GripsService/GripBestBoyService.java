package za.ac.cput.projects.Services.GripsService;

import za.ac.cput.projects.Domain.Grips.GripBestBoy;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface GripBestBoyService extends IService<GripBestBoy,String> {

    Set<GripBestBoy> getAll();
}
