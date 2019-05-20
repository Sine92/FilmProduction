package za.ac.cput.projects.Services.CaterService;

import za.ac.cput.projects.Domain.Catering.CaterTeamLeader;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface CaterTeamLerderService extends IService<CaterTeamLeader, String> {
    Set<CaterTeamLeader> getAll();
}
