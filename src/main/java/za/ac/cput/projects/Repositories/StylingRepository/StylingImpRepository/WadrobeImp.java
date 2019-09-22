package za.ac.cput.projects.Repositories.StylingRepository.StylingImpRepository;

import za.ac.cput.projects.Domain.Styling.Wadrobe;
import za.ac.cput.projects.Repositories.StylingRepository.WardropRepository;

import java.util.Set;

public class WadrobeImp implements WardropRepository {

    private static WadrobeImp wadrobeImp = null;
    private Set<Wadrobe> wadrobeSet;
    public static WadrobeImp getWadrobeImp()
    {
        if(wadrobeImp == null) wadrobeImp = new WadrobeImp();
        return  wadrobeImp;
    }
    private Wadrobe findWadrobe(String wadId)
    {
        return  this.wadrobeSet.stream()
                .filter(wadrobe -> wadrobe.getWadId().trim().trim().equals(wadId))
                .findAny()
                .orElse(null);
    }

    @Override
    public Set<Wadrobe> getAll() {
        return wadrobeSet;
    }

    @Override
    public Wadrobe create(Wadrobe wadrobe) {
        this.wadrobeSet.add(wadrobe);
        return wadrobe;
    }

    @Override
    public void delete(String wadId) {
      Wadrobe toDelete = findWadrobe(wadId);
      if(toDelete!=null){
          this.wadrobeSet.remove(toDelete);
      }

    }

    @Override
    public Wadrobe update(Wadrobe wadrobe) {
      Wadrobe toUpdate = findWadrobe(wadrobe.getWadId());
      if(toUpdate!=null){
          this.wadrobeSet.remove(toUpdate);
          return create(wadrobe);
      }
      return null;
    }

    @Override
    public Wadrobe read(String wadId) {
       Wadrobe wadrobe = findWadrobe(wadId);
       return wadrobe;

    }
}
