package za.ac.cput.projects.Repositories.LightingRepository.LightingImpRepository;

import za.ac.cput.projects.Domain.Lighting.Gaffer;
import za.ac.cput.projects.Repositories.LightingRepository.GafferRepository;

import java.util.Set;

public class GafferImp implements GafferRepository {
    private static GafferImp gafferImp = null;

    private Set<Gaffer> gafferSet;
    public static GafferImp getGafferImp()
    {
        if(gafferImp == null) gafferImp = new GafferImp();
        return gafferImp;
    }
   private Gaffer findGaffer(String gafId)
   {
       return this.gafferSet.stream()
               .filter(gaffer -> gaffer.getGafId().trim().equals(gafId))
               .findAny()
               .orElse(null);
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
    public void delete(String gafId) {
       Gaffer toDelete = findGaffer(gafId);
       if(toDelete!=null){
           this.gafferSet.remove(toDelete);
       }


    }

    @Override
    public Gaffer update(Gaffer gaffer) {
       Gaffer toUpdate = findGaffer(gaffer.getGafId());
       if(toUpdate!=null){
           this.gafferSet.remove(toUpdate);
           return create(gaffer);
       }
       return null;
    }

    @Override
    public Gaffer read(String gafId) {

       Gaffer gaffer = findGaffer(gafId);
       return gaffer;
    }
}
