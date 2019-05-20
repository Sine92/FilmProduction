package za.ac.cput.projects.Repositories.StylingRepository;

import za.ac.cput.projects.Repositories.ArtRepository.IRepository;
import za.ac.cput.projects.Domain.Styling.MakeUpAssist;

import java.util.Set;

public interface MakeUPRepository extends IRepository <MakeUpAssist, String> {

    Set<MakeUpAssist> getAll();
}
