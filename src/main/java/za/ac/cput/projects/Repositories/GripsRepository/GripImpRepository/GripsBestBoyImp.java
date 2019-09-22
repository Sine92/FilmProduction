package za.ac.cput.projects.Repositories.GripsRepository.GripImpRepository;

import za.ac.cput.projects.Domain.Grips.GripBestBoy;
import za.ac.cput.projects.Repositories.GripsRepository.GripBoyRepository;

import java.util.HashSet;
import java.util.Set;

public class GripsBestBoyImp implements GripBoyRepository {

  private static GripsBestBoyImp gripsBestBoyImp = null;
  private Set<GripBestBoy> gripBestBoySet;
  public GripsBestBoyImp()
  {
      this.gripBestBoySet = new HashSet<>();
  }
  public static GripsBestBoyImp getGripsBestBoyImp()
  {
      if(gripsBestBoyImp ==  null) gripsBestBoyImp = new GripsBestBoyImp();
      return gripsBestBoyImp;
  }
  private GripBestBoy findGrip(String gbId)
  {
      return this.gripBestBoySet.stream()
              .filter(gripBestBoy -> gripBestBoy.getGbId().trim().equals(gbId))
              .findAny()
              .orElse(null);
  }

    @Override
    public Set<GripBestBoy> getAll() {
        return gripBestBoySet;
    }

    @Override
    public GripBestBoy create(GripBestBoy gripBestBoy) {
        this.gripBestBoySet.add(gripBestBoy);
        return gripBestBoy;
    }

    @Override
    public void delete(String gbId) {

      GripBestBoy toDelete = findGrip(gbId);
      if(toDelete!=null){
          this.gripBestBoySet.remove(toDelete);
      }


    }

    @Override
    public GripBestBoy update(GripBestBoy gripBestBoy) {
     GripBestBoy toUpdate = findGrip(gripBestBoy.getGbId());
     if(toUpdate!=null){
         this.gripBestBoySet.remove(toUpdate);
         return create(gripBestBoy);
     }
     return null;
    }

    @Override
    public GripBestBoy read(String gbId) {
     GripBestBoy gripBestBoy = findGrip(gbId);
     return gripBestBoy;
    }
}
