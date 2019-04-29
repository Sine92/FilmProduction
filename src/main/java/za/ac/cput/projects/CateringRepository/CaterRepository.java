package za.ac.cput.projects.CateringRepository;

import za.ac.cput.projects.ArtRepository.IRepository;
import za.ac.cput.projects.Catering.CaterTeamLeader;

import java.util.Set;

public interface CaterRepository extends IRepository <CaterTeamLeader,String> {

    Set<CaterTeamLeader> getAll();
}
