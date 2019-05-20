package za.ac.cput.projects.Repositories.CateringRepository;

import za.ac.cput.projects.Repositories.ArtRepository.IRepository;
import za.ac.cput.projects.Domain.Catering.CaterTeamLeader;

import java.util.Set;

public interface CaterRepository extends IRepository <CaterTeamLeader,String> {

    Set<CaterTeamLeader> getAll();
}
