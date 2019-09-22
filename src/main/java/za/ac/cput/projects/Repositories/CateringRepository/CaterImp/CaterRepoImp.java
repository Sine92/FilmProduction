package za.ac.cput.projects.Repositories.CateringRepository.CaterImp;

import za.ac.cput.projects.Domain.Catering.CaterTeamLeader;
import za.ac.cput.projects.Repositories.CateringRepository.CaterRepository;

import java.util.HashSet;
import java.util.Set;

public class CaterRepoImp implements CaterRepository {

    private static CaterRepoImp caterRepoImp = null;
    private Set<CaterTeamLeader> caterTeamLeaderSet;

    private CaterRepoImp()
    {
        this.caterTeamLeaderSet = new HashSet<>();
    }
    public static CaterRepoImp getCaterRepoImp()
    {
        if(caterRepoImp == null)caterRepoImp = new CaterRepoImp();
        return caterRepoImp;
    }

    private CaterTeamLeader findCaterTeam(String ctId)
    {
        return this.caterTeamLeaderSet.stream()
                .filter(caterTeamLeader -> caterTeamLeader.getCtTId().trim().equals(ctId))
                .findAny()
                .orElse(null);
    }


    @Override
    public Set<CaterTeamLeader> getAll() {
        return caterTeamLeaderSet;
    }

    @Override
    public CaterTeamLeader create(CaterTeamLeader caterTeamLeader) {
        this.caterTeamLeaderSet.add(caterTeamLeader);
        return caterTeamLeader;
    }

    @Override
    public void delete(String ctId) {
        CaterTeamLeader toDelete = findCaterTeam(ctId);
        if(toDelete!=null){
            this.caterTeamLeaderSet.remove(toDelete);
        }

    }

    @Override
    public CaterTeamLeader update(CaterTeamLeader caterTeamLeader) {
        CaterTeamLeader toUpdate = findCaterTeam(caterTeamLeader.getCtTId());
        if(toUpdate!=null){
            this.caterTeamLeaderSet.remove(toUpdate);
        }
       return null;
    }

    @Override
    public CaterTeamLeader read(String ctId) {
       CaterTeamLeader caterTeamLeader = findCaterTeam(ctId);
       return caterTeamLeader;
    }
}
