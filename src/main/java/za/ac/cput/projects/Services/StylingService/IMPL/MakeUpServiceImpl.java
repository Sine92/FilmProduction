package za.ac.cput.projects.Services.StylingService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Styling.MakeUpAssist;
import za.ac.cput.projects.Repositories.StylingRepository.StylingImpRepository.MakeUpArtImpl;
import za.ac.cput.projects.Services.StylingService.MakeUpService;

import java.util.Set;
 @Service("MakeUpServiceImpl")
public class MakeUpServiceImpl implements MakeUpService {
     @Autowired
     @Qualifier("MakeUpServiceImpl")
     private MakeUpServiceImpl service = null;
     private MakeUpArtImpl makeUpArt;
    @Override
    public Set<MakeUpAssist> getAll() {
        return makeUpArt.getAll();
    }

    @Override
    public MakeUpAssist create(MakeUpAssist makeUpAssist) {
        return makeUpArt.create(makeUpAssist);
    }

    @Override
    public MakeUpAssist update(MakeUpAssist makeUpAssist) {
        return makeUpArt.update(makeUpAssist);
    }

    @Override
    public void delete(String makeUAId) {
        makeUpArt.delete(makeUAId);

    }

    @Override
    public MakeUpAssist read(String makeUAId) {
        return makeUpArt.read(makeUAId);
    }
}
