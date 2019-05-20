package za.ac.cput.projects.Repositories.UnitRepository.UnitImpRepository;

import za.ac.cput.projects.Domain.Unit.UnitAssist;
import za.ac.cput.projects.Repositories.UnitRepository.UnitAsRepository;

import java.util.HashSet;
import java.util.Set;

public class UnitAssImp implements UnitAsRepository {


    private static UnitAssImp unitAssImp = null;
    private Set<UnitAssist> unitAssistSet;
    private UnitAssImp()
    {
        this.unitAssistSet = new HashSet<>();
    }
    public static UnitAssImp getUnitAssImp()
    {
        if(unitAssImp == null)unitAssImp = new UnitAssImp();
        return unitAssImp;
    }

    @Override
    public Set<UnitAssist> getAll() {
        return unitAssistSet;
    }

    @Override
    public UnitAssist create(UnitAssist unitAssist) {

        this.unitAssistSet.add(unitAssist);
        return unitAssist;
    }

    @Override
    public void delete(String s) {

        unitAssistSet.removeIf(t->t.getUnName().equals(s));

    }

    @Override
    public UnitAssist update(UnitAssist unitAssist) {

        if(unitAssistSet.contains(unitAssist))
        {
            for(UnitAssist unitAssist1: unitAssistSet)
            {
                if(unitAssist1.equals(unitAssist)){
                    return unitAssist1;
                }
            }
        }
        return null;
    }

    @Override
    public UnitAssist read(String s) {


        if(unitAssImp.unitAssistSet.contains(s))
        {
            for(UnitAssist unitAssist1: unitAssistSet)
            {
                if(unitAssist1.equals(s))
                    return unitAssist1;
            }
        }

        return null;


    }
}
