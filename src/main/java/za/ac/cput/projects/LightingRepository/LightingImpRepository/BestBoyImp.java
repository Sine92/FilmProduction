package za.ac.cput.projects.LightingRepository.LightingImpRepository;

import za.ac.cput.projects.Lighting.BestBoy;
import za.ac.cput.projects.LightingRepository.BestBoyRepository;

import java.util.HashSet;
import java.util.Set;

public class BestBoyImp implements BestBoyRepository {

    private static BestBoyImp bestBoyImp= null;
    private Set<BestBoy> bestBoySet;
    private BestBoyImp()
    {
        this.bestBoySet = new HashSet<>();
    }
    public static BestBoyImp getBestBoyImp()
    {
        if( bestBoyImp == null) bestBoyImp =  new BestBoyImp();
        return bestBoyImp;
    }

    @Override
    public Set<BestBoy> getAll() {
        return bestBoySet;
    }

    @Override
    public BestBoy create(BestBoy bestBoy) {
        this.bestBoySet.add(bestBoy);
        return bestBoy;
    }

    @Override
    public void delete(String s) {
        bestBoySet.removeIf(t->t.getBbName().equals(s));

    }

    @Override
    public BestBoy update(BestBoy bestBoy) {
        if(bestBoySet.contains(bestBoy))
        {
            for(BestBoy bestBoy1: bestBoySet)
            {
                if(bestBoy1.equals(bestBoy))
                {
                    return bestBoy1;
                }
            }
        }
        return null;
    }

    @Override
    public BestBoy read(BestBoy bestBoy) {
        if(bestBoyImp.bestBoySet.contains(bestBoy))
        {
            for(BestBoy bestBoy1:bestBoySet)
            {
                if(bestBoy1.equals(bestBoy))
                {
                    return bestBoy1;
                }
            }
        }
        return null;
    }
}
