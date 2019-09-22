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
    public UnitManager findUniMan(String unMId)
    {
        return this.unitManagerSet.stream()
                .filter(unitManager -> unitManager.getUnMId().trim().equals(unMId))
                .findAny()
                .orElse(null);
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
    public void delete(String unMId) {
       UnitManager toDelete = findUniMan(unMId);
       if(toDelete!=null){
           this.unitManagerSet.remove(toDelete);
       }

    }

    @Override
    public UnitManager update(UnitManager unitManager) {
        UnitManager toUpdate = findUniMan(unitManager.getUnMId());
        if(toUpdate!=null){
            this.unitManagerSet.remove(toUpdate);
            return create(unitManager);
        }
       return null;
    }

    @Override
    public UnitManager read(String unMId) {
      UnitManager unitManager = findUniMan(unMId);
      return unitManager;
    }
}
