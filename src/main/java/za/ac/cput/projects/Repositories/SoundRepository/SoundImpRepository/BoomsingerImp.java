package za.ac.cput.projects.Repositories.SoundRepository.SoundImpRepository;

import za.ac.cput.projects.Domain.Sound.BoomSwinger;
import za.ac.cput.projects.Repositories.SoundRepository.BoomSwingerRepository;

import java.util.Set;

public class BoomsingerImp implements BoomSwingerRepository {

    private static  BoomsingerImp boomsingerImp = null;
    private Set<BoomSwinger> boomSwingerSet;
    public static BoomsingerImp getBoomsingerImp()
    {
        if(boomsingerImp== null) boomsingerImp = new BoomsingerImp();
        return boomsingerImp;
    }
    private BoomSwinger findBoomSwinger(String bsId)
    {
        return this.boomSwingerSet.stream()
                .filter(boomSwinger -> boomSwinger.getBsId().trim().equals(bsId))
                .findAny()
                .orElse(null);
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
    public void delete(String bsId) {
       BoomSwinger toDelete = findBoomSwinger(bsId);
       if(toDelete!=null){
           this.boomSwingerSet.remove(toDelete);
       }

    }

    @Override
    public BoomSwinger update(BoomSwinger boomSwinger) {
     BoomSwinger toUpdate = findBoomSwinger(boomSwinger.getBsId());
     if(toUpdate!=null){
         this.boomSwingerSet.remove(toUpdate);
         return create(boomSwinger);
     }
     return null;
    }

    @Override
    public BoomSwinger read(String bsId) {
      BoomSwinger boomSwinger = findBoomSwinger(bsId);
      return boomSwinger;
    }
}
