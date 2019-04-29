package za.ac.cput.projects.ProductionRepository.ProductionImpRepo;

import za.ac.cput.projects.Production.FirstAD;
import za.ac.cput.projects.ProductionRepository.FirtADRepo;

import java.util.Set;

public class FirstADImp implements FirtADRepo {

    private static FirstADImp firstADImp = null;
    private Set<FirstAD> firstADSet;
    public static FirstADImp getFirstADImp()
    {
        if(firstADImp == null)firstADImp = new FirstADImp();
        return  firstADImp;
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
    public void delete(String s) {
        firstADSet.removeIf(t->t.getfAdName().equals(s));

    }

    @Override
    public FirstAD update(FirstAD firstAD) {
        if(firstADSet.contains(firstAD))
        {
            for(FirstAD firstAD1:firstADSet)
            {
                if(firstAD1.equals(firstAD))
                {
                    return firstAD1;
                }
            }
        }
        return null;
    }

    @Override
    public FirstAD read(FirstAD firstAD) {

        if(firstADImp.firstADSet.contains(firstAD))
        {
            for(FirstAD firstAD1:firstADSet)
            {
                if(firstAD1.equals(firstAD))
                {
                    return firstAD1;
                }
            }
        }
        return null;
    }
}
