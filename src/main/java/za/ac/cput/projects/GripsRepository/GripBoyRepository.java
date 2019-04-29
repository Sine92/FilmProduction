package za.ac.cput.projects.GripsRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Grips.GripBestBoy;
import za.ac.cput.projects.GripsRepository.GripImpRepository.GripsBestBoyImp;

import java.util.Set;

public interface GripBoyRepository extends IRepository<GripBestBoy,String> {

    Set<GripBestBoy> getAll();
}
