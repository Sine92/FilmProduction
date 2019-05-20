package za.ac.cput.projects.Repositories.UnitRepository.UnitImpRepository;

import za.ac.cput.projects.Domain.Unit.UnitManager;
import za.ac.cput.projects.Repositories.UnitRepository.UnitAsRepository;
import za.ac.cput.projects.Repositories.UnitRepository.UnitManRepository;

import java.util.HashSet;
import java.util.Set;

public class UnitManImp implements UnitManRepository {

    private static UnitManImp unitManImp = null;
    private Set<UnitManager> unitManagerSet;

    private UnitManImp()
    {
        this.unitManagerSet = new HashSet<>();
    }

    public static UnitManImp getUnitManImp()
    {
        if(unitManImp == null) unitManImp = new UnitManImp();
        return unitManImp;
    }

    @Override
    public Set<UnitManager> getAll() {
        return unitManagerSet;
    }

    @Override
    public UnitManager create(UnitManager unitManager) {

        this.unitManagerSet.add(unitManager);
       return unitManager;
    }

    @Override
    public void delete(String s) {
        unitManagerSet.removeIf(t->t.getUnMName().equals(s));

    }

    @Override
    public UnitManager update(UnitManager unitManager) {
        if(unitManagerSet.contains(unitManager))
        {
            for(UnitManager unitManager1: unitManagerSet)
            {
                if(unitManager1.equals(unitManager)){
                    return unitManager1;
                }
            }
        }

        return null;
    }

    @Override
    public UnitManager read(String s) {
        if(unitManImp.unitManagerSet.contains(s)){
            for(UnitManager unitManager1: unitManagerSet)
            {
                if(unitManager1.equals(s))
                {
                    return unitManager1;
                }
            }
        }

        return null;
    }
}
