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
    public void delete(String s) {

      gripBestBoySet.removeIf(t->t.getGbName().equals(s));

    }

    @Override
    public GripBestBoy update(GripBestBoy gripBestBoy) {
      if(gripBestBoySet.contains(gripBestBoy))
      {
          for(GripBestBoy gripBestBoy1:gripBestBoySet)
          {
              if(gripBestBoy1.equals(gripBestBoy))
              {
                  return gripBestBoy1;
              }
          }
      }
        return null;
    }

    @Override
    public GripBestBoy read(String s) {
      if(gripsBestBoyImp.gripBestBoySet.contains(s))
      {
          for(GripBestBoy gripBestBoy1: gripBestBoySet)
          {
              if(gripBestBoy1.equals(s))
              {
                  return gripBestBoy1;
              }
          }
      }
        return null;
    }
}
