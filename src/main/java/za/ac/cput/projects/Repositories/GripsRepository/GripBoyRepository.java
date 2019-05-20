package za.ac.cput.projects.Repositories.GripsRepository;

import za.ac.cput.projects.Repositories.ArtRepository.IRepository;
import za.ac.cput.projects.Domain.Grips.GripBestBoy;
import za.ac.cput.projects.Repositories.GripsRepository.GripBoyRepository;

import java.util.Set;

public interface GripBoyRepository extends IRepository<GripBestBoy,String> {

    Set<GripBestBoy> getAll();
}
