package za.ac.cput.projects.LightingRepository.LightingImpRepository;

import za.ac.cput.projects.Lighting.Gaffer;
import za.ac.cput.projects.LightingRepository.GafferRepository;

import java.util.Set;

public class GafferImp implements GafferRepository {
    private static GafferImp gafferImp = null;

    private Set<Gaffer> gafferSet;
    public static GafferImp getGafferImp()
    {
        if(gafferImp == null) gafferImp = new GafferImp();
        return gafferImp;
    }

    @Override
    public Set<Gaffer> getAll() {
        return gafferSet;
    }

    @Override
    public Gaffer create(Gaffer gaffer) {
        this.gafferSet.add(gaffer);
        return gaffer;
    }

    @Override
    public void delete(String s) {
        gafferSet.removeIf(t->t.getGafName().equals(s));


    }

    @Override
    public Gaffer update(Gaffer gaffer) {
        if(gafferSet.contains(gaffer))
        {
            for(Gaffer gaffer1:gafferSet)
            {
                if(gaffer1.equals(gaffer))
                {
                    return gaffer1;
                }
            }
        }
        return null;
    }

    @Override
    public Gaffer read(Gaffer gaffer) {

        if(gafferImp.gafferSet.contains(gaffer))
        {
            for(Gaffer gaffer1:gafferSet)
            {
                if(gaffer1.equals(gaffer))
                {
                    return gaffer1;
                }
            }
        }
        return null;
    }
}
