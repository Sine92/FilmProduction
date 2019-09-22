package za.ac.cput.projects.Repositories.LightingRepository.LightingImpRepository;

import za.ac.cput.projects.Domain.Lighting.BestBoy;
import za.ac.cput.projects.Repositories.LightingRepository.BestBoyRepository;

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
    private BestBoy findBestboy(String bbId){
        return this.bestBoySet.stream()
                .filter(bestBoy -> bestBoy.getBbId().trim().equals(bbId))
                .findAny()
                .orElse(null);
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
    public void delete(String bbId) {
     BestBoy toDelete = findBestboy(bbId);
     if(toDelete!=null){
         this.bestBoySet.remove(toDelete);
     }

    }

    @Override
    public BestBoy update(BestBoy bestBoy) {
        BestBoy toUpdate = findBestboy(bestBoy.getBbId());
        if(toUpdate!=null){
            this.bestBoySet.remove(toUpdate);
            return create(bestBoy);
        }
        return null;
    }

    @Override
    public BestBoy read(String bbId) {
       BestBoy bestBoy = findBestboy(bbId);
       return bestBoy;
    }
}
