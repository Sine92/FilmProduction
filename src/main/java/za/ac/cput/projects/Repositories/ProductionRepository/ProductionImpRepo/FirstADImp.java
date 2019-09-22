package za.ac.cput.projects.Repositories.ProductionRepository.ProductionImpRepo;

import za.ac.cput.projects.Domain.Production.FirstAD;
import za.ac.cput.projects.Repositories.ProductionRepository.FirtADRepo;

import java.util.Set;

public class FirstADImp implements FirtADRepo {

    private static FirstADImp firstADImp = null;
    private Set<FirstAD> firstADSet;
    public static FirstADImp getFirstADImp()
    {
        if(firstADImp == null)firstADImp = new FirstADImp();
        return  firstADImp;
    }
    private FirstAD findFirstAd(String faId)
    {
        return this.firstADSet.stream()
                .filter(firstAD -> firstAD.getFaId().trim().equals(faId))
                .findAny()
                .orElse(null);
    }
    @Override
    public Set<FirstAD> getAll() {
        return firstADSet;
    }

    @Override
    public FirstAD create(FirstAD firstAD) {
        this.firstADSet.add(firstAD);
        return firstAD;
    }

    @Override
    public void delete(String faId) {
        FirstAD toDelete = findFirstAd(faId);
        if(toDelete!=null){
            this.firstADSet.remove(toDelete);
        }

    }

    @Override
    public FirstAD update(FirstAD firstAD) {
        FirstAD toUpdate = findFirstAd(firstAD.getFaId());
        if(toUpdate!=null){
            this.firstADSet.remove(firstAD.getFaId());
        }
        return firstAD;
    }

    @Override
    public FirstAD read(String faId) {
        FirstAD firstAD = findFirstAd(faId);
        return firstAD;
    }
}
