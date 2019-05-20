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
    public void delete(String s) {
        caterTeamLeaderSet.removeIf(t->t.getCtTName().equals(s));


    }

    @Override
    public CaterTeamLeader update(CaterTeamLeader caterTeamLeader) {
        if(caterTeamLeaderSet.contains(caterTeamLeader))
        {
            for(CaterTeamLeader caterTeamLeader1: caterTeamLeaderSet)
            {
                if(caterTeamLeader1.equals(caterTeamLeader))
                {
                    return caterTeamLeader1;
                }
            }
        }
        return null;
    }

    @Override
    public CaterTeamLeader read(String s) {
        if(caterRepoImp.caterTeamLeaderSet.contains(s))
        {
            for(CaterTeamLeader caterTeamLeader1: caterTeamLeaderSet)
            {
                if(caterTeamLeader1.equals(s))
                {
                    return caterTeamLeader1;
                }
            }
        }
        return null;
    }
}
