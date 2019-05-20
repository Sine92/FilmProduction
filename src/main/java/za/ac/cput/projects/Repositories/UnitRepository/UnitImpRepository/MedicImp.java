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
    public void delete(String s) {

        medicSet.removeIf(t->t.getMedName().equals(s));


    }

    @Override
    public Medic update(Medic medic) {
        if(medicSet.contains(medic))
        {
            for(Medic medic1: medicSet)
            {
                if(medic1.equals(medic))
                {
                    return medic1;
                }
            }
        }

        return null;
    }

    @Override
    public Medic read(String s) {
        if(medicImp.medicSet.contains(s))
        {
            for(Medic medic1: medicSet)
            {
                if(medic1.equals(s))
                {
                    return medic1;
                }
            }
        }

        return null;
    }
}
