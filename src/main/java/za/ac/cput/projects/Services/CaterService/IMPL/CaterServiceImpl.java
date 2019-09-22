package za.ac.cput.projects.Services.CaterService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Catering.CaterTeamLeader;
import za.ac.cput.projects.Repositories.CateringRepository.CaterImp.CaterRepoImp;
import za.ac.cput.projects.Services.CaterService.CaterTeamLerderService;

import java.util.Set;
@Service("CaterServiceImpl")
public class CaterServiceImpl implements CaterTeamLerderService {
    @Autowired
    @Qualifier("CaterServiceImpl")
    private CaterServiceImpl service = null;
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
    public void delete(String ctId) {
        caterRepoImp.delete(ctId);

    }

    @Override
    public CaterTeamLeader read(String ctId) {
        return caterRepoImp.read(ctId);
    }
}
