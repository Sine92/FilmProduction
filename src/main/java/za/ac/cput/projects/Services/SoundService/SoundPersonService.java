package za.ac.cput.projects.Services.SoundService;

import za.ac.cput.projects.Domain.Sound.SoundPerson;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface SoundPersonService extends IService<SoundPerson, String> {

    Set<SoundPerson> getAll();
}
