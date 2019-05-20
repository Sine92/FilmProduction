package za.ac.cput.projects.Services.SoundService;

import za.ac.cput.projects.Domain.Sound.BoomSwinger;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface BoomSwingerService extends IService<BoomSwinger, String> {
    Set<BoomSwinger> getAll();
}
