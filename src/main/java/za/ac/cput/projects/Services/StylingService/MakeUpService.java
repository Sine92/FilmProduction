package za.ac.cput.projects.Services.StylingService;

import za.ac.cput.projects.Domain.Styling.MakeUpAssist;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface MakeUpService extends IService<MakeUpAssist, String> {

    Set<MakeUpAssist> getAll();
}
