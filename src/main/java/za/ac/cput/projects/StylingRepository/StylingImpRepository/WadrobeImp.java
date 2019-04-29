package za.ac.cput.projects.StylingRepository.StylingImpRepository;

import za.ac.cput.projects.Styling.Wadrobe;
import za.ac.cput.projects.StylingRepository.WardropRepository;

import java.util.Set;

public class WadrobeImp implements WardropRepository {

    private static WadrobeImp wadrobeImp = null;
    private Set<Wadrobe> wadrobeSet;
    public static WadrobeImp getWadrobeImp()
    {
        if(wadrobeImp == null) wadrobeImp = new WadrobeImp();
        return  wadrobeImp;
    }

    @Override
    public Set<Wadrobe> getAll() {
        return wadrobeSet;
    }

    @Override
    public Wadrobe create(Wadrobe wadrobe) {
        this.wadrobeSet.add(wadrobe);
        return wadrobe;
    }

    @Override
    public void delete(String s) {
        wadrobeSet.removeIf(t->t.getWadName().equals(s));

    }

    @Override
    public Wadrobe update(Wadrobe wadrobe) {
        if(wadrobeSet.contains(wadrobe))
        {
            for(Wadrobe wadrobe1:wadrobeSet)
            {
                if(wadrobe1.equals(wadrobe))
                {
                    return wadrobe1;
                }
            }
        }
        return null;
    }

    @Override
    public Wadrobe read(Wadrobe wadrobe) {

        if(wadrobeImp.wadrobeSet.contains(wadrobe))
        {
            for (Wadrobe wadrobe1: wadrobeSet)
            {
                if(wadrobe1.equals(wadrobe))
                {
                    return wadrobe1;
                }
            }
        }
        return null;
    }
}
