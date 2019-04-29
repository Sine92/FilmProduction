package za.ac.cput.projects.StylingRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Styling.MakeUpAssist;

import java.util.Set;

public interface MakeUPRepository extends IRepository <MakeUpAssist, String> {

    Set<MakeUpAssist> getAll();
}
