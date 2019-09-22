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
    private UnitAssist findUnitAss(String unId)
    {
        return this.unitAssistSet.stream()
                .filter(unitAssist -> unitAssist.getUnId().trim().equals(unId))
                .findAny()
                .orElse(null);
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
    public void delete(String unId) {
     UnitAssist toDelete = findUnitAss(unId);
     if(toDelete!=null){
         this.unitAssistSet.remove(toDelete);
     }


    }

    @Override
    public UnitAssist update(UnitAssist unitAssist) {
        UnitAssist toUpdate = findUnitAss(unitAssist.getUnId());
        if(toUpdate!=null){
            this.unitAssistSet.remove(toUpdate);
            return create(unitAssist);
        }
       return null;
    }

    @Override
    public UnitAssist read(String unId) {

        UnitAssist unitAssist = findUnitAss(unId);
        return unitAssist;

    }
}
