package za.ac.cput.projects.SoundRepository.SoundImpRepository;

import za.ac.cput.projects.Sound.BoomSwinger;
import za.ac.cput.projects.SoundRepository.BoomSwingerRepository;

import java.util.Set;

public class BoomsingerImp implements BoomSwingerRepository {

    private static  BoomsingerImp boomsingerImp = null;
    private Set<BoomSwinger> boomSwingerSet;
    public static BoomsingerImp getBoomsingerImp()
    {
        if(boomsingerImp== null) boomsingerImp = new BoomsingerImp();
        return boomsingerImp;
    }

    @Override
    public Set<BoomSwinger> getAll() {
        return boomSwingerSet;
    }

    @Override
    public BoomSwinger create(BoomSwinger boomSwinger) {
        this.boomSwingerSet.add(boomSwinger);
        return boomSwinger;
    }

    @Override
    public void delete(String s) {
        boomSwingerSet.removeIf(t->t.getBsName().equals(s));

    }

    @Override
    public BoomSwinger update(BoomSwinger boomSwinger) {
        if(boomSwingerSet.contains(boomSwinger))
        {
            for(BoomSwinger boomSwinger1: boomSwingerSet)
            {
                if(boomSwinger1.equals(boomSwinger))
                {
                    return boomSwinger1;
                }
            }
        }
        return null;
    }

    @Override
    public BoomSwinger read(BoomSwinger boomSwinger) {
        if(boomsingerImp.boomSwingerSet.contains(boomSwinger))
        {
            for(BoomSwinger boomSwinger1: boomSwingerSet)
            {
                if(boomSwinger1.equals(boomSwinger))
                {
                    return boomSwinger1;
                }
            }
        }
        return null;
    }
}
