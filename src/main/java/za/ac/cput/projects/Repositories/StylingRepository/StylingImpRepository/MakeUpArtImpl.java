package za.ac.cput.projects.Repositories.StylingRepository.StylingImpRepository;

import za.ac.cput.projects.Domain.Styling.MakeUpAssist;
import za.ac.cput.projects.Repositories.StylingRepository.MakeUPRepository;

import java.util.Set;

public class MakeUpArtImpl implements MakeUPRepository {

    private static MakeUpArtImpl makeUpArt = null;
    private Set<MakeUpAssist> makeUpAssistSet;
    public static MakeUpArtImpl getMakeUpArt()
    {
        if(makeUpArt == null) makeUpArt = new MakeUpArtImpl();
        return makeUpArt;
    }
    private MakeUpAssist findMakeAss(String makeUAId)
    {
        return this.makeUpAssistSet.stream()
                .filter(makeUpAssist -> makeUpAssist.getMakeUAId().trim().equals(makeUAId))
                .findAny()
                .orElse(null);
    }

    @Override
    public Set<MakeUpAssist> getAll() {
        return makeUpAssistSet;
    }

    @Override
    public MakeUpAssist create(MakeUpAssist makeUpAssist) {

        this.makeUpAssistSet.add(makeUpAssist);
        return makeUpAssist;
    }

    @Override
    public void delete(String makeUAId) {
        MakeUpAssist toDelete = findMakeAss(makeUAId);
        if(toDelete!=null){
            this.makeUpAssistSet.remove(toDelete);
        }

    }

    @Override
    public MakeUpAssist update(MakeUpAssist makeUpAssist) {
      MakeUpAssist toUpdate = findMakeAss(makeUpAssist.getMakeUAId());
      if(toUpdate!=null){
          this.makeUpAssistSet.remove(toUpdate);
          return create(makeUpAssist);
      }
      return null;
    }
    @Override
    public MakeUpAssist read(String makeUAId) {
      MakeUpAssist makeUpAssist = findMakeAss(makeUAId);
      return makeUpAssist;
    }
}
