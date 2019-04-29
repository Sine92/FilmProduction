package za.ac.cput.projects.StylingRepository.StylingImpRepository;

import za.ac.cput.projects.Styling.MakeUpAssist;
import za.ac.cput.projects.StylingRepository.MakeUPRepository;

import java.util.Set;

public class MakeUpArtImpl implements MakeUPRepository {

    private static MakeUpArtImpl makeUpArt = null;
    private Set<MakeUpAssist> makeUpAssistSet;
    public static MakeUpArtImpl getMakeUpArt()
    {
        if(makeUpArt == null) makeUpArt = new MakeUpArtImpl();
        return makeUpArt;
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
    public void delete(String s) {

        makeUpAssistSet.removeIf(t->t.getMakeUAName().equals(s));

    }

    @Override
    public MakeUpAssist update(MakeUpAssist makeUpAssist) {
        if(makeUpAssistSet.contains(makeUpAssist))
        {
            for(MakeUpAssist makeUpAssist1: makeUpAssistSet)
            {
                if(makeUpAssist1.equals(makeUpAssist))
                {
                    return makeUpAssist1;
                }
            }
        }
        return null;
    }

    @Override
    public MakeUpAssist read(MakeUpAssist makeUpAssist) {

        if(makeUpArt.makeUpAssistSet.contains(makeUpAssist))
        {
            for(MakeUpAssist makeUpAssist1: makeUpAssistSet)
            {
                if(makeUpAssist1.equals(makeUpAssist))
                {
                    return makeUpAssist1;
                }
            }
        }
        return null;
    }
}
