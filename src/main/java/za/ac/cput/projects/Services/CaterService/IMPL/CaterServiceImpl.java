package za.ac.cput.projects.Services.CaterService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Catering.CaterTeamLeader;
import za.ac.cput.projects.Repositories.CateringRepository.CaterImp.CaterRepoImp;
import za.ac.cput.projects.Services.CaterService.CaterTeamLerderService;

import java.util.Set;
@Service("ServiceImpl")
public class CaterServiceImpl implements CaterTeamLerderService {
    @Autowired
    @Qualifier("InMemory")
    private CaterRepoImp caterRepoImp;
    @Override
    public Set<CaterTeamLeader> getAll() {
        return caterRepoImp.getAll();
    }

    @Override
    public CaterTeamLeader create(CaterTeamLeader caterTeamLeader) {
        return caterRepoImp.create(caterTeamLeader);
    }

    @Override
    public CaterTeamLeader update(CaterTeamLeader caterTeamLeader) {
        return caterRepoImp.update(caterTeamLeader);
    }

    @Override
    public void delete(String s) {
        caterRepoImp.delete(s);

    }

    @Override
    public CaterTeamLeader read(String s) {
        return caterRepoImp.read(s);
    }
}
