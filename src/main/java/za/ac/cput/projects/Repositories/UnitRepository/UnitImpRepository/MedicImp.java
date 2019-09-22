package za.ac.cput.projects.Repositories.UnitRepository.UnitImpRepository;

import za.ac.cput.projects.Domain.Unit.Medic;
import za.ac.cput.projects.Repositories.UnitRepository.MedicRepository;

import java.util.HashSet;
import java.util.Set;

public class MedicImp implements MedicRepository {

    private static MedicImp medicImp= null;
    private Set<Medic> medicSet;
    private MedicImp()
    {
        this.medicSet = new HashSet<>();
    }
    public static MedicImp getMedicImp()
    {
        if(medicImp == null) medicImp = new MedicImp();
        return  medicImp;
    }
    private Medic findMedic(String medId)
    {
        return this.medicSet.stream()
                .filter(medic -> medic.getMedId().trim().equals(medId))
                .findAny()
                .orElse(null);
    }

    @Override
    public Set<Medic> getAll() {
        return medicSet;
    }

    @Override
    public Medic create(Medic medic) {
        this.medicSet.add(medic);
        return medic;
    }

    @Override
    public void delete(String medId) {

     Medic toDelete = findMedic(medId);
     if(toDelete!=null){
         this.medicSet.remove(medId);
     }


    }

    @Override
    public Medic update(Medic medic) {
        Medic toUpdate = findMedic(medic.getMedId());
        if(toUpdate!=null){
            this.medicSet.remove(toUpdate);
            return  create(medic);
        }
        return null;
    }

    @Override
    public Medic read(String medId) {
       Medic medic = findMedic(medId);
       return medic;
    }
}
