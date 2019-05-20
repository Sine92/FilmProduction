package za.ac.cput.projects.Services.GripsService;

import za.ac.cput.projects.Domain.Grips.KeyGrip;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface KeyGripService extends IService<KeyGrip,String> {
    Set<KeyGrip> getAll();
}
