package za.ac.cput.projects.Repositories.LightingRepository.LightingImpRepository;

import za.ac.cput.projects.Domain.Lighting.GeneratorOp;
import za.ac.cput.projects.Repositories.LightingRepository.GenOpRepository;

import java.util.Set;

public class GenOpImp implements GenOpRepository {
    private static GenOpImp genOpImp= null;
    private Set<GeneratorOp> generatorOpSet;
    public static GenOpImp getGenOpImp()
    {
        if(genOpImp == null) genOpImp = new GenOpImp();
        return  genOpImp;
    }

    @Override
    public Set<GeneratorOp> getAll() {
        return generatorOpSet;
    }

    @Override
    public GeneratorOp create(GeneratorOp generatorOp) {
        this.generatorOpSet.add(generatorOp);
        return generatorOp;
    }

    @Override
    public void delete(String s) {
        generatorOpSet.removeIf(t->t.getGenName().equals(s));

    }

    @Override
    public GeneratorOp update(GeneratorOp generatorOp) {
        if(generatorOpSet.contains(generatorOp))
        {
            for(GeneratorOp generatorOp1:generatorOpSet)
            {
                if(generatorOp1.equals(generatorOp))
                {
                    return generatorOp1;
                }
            }
        }
        return null;
    }

    @Override
    public GeneratorOp read(String s)
    {
        if(genOpImp.generatorOpSet.contains(s))
        {
            for(GeneratorOp generatorOp: generatorOpSet)
            {
                if(generatorOp.equals(s))
                {
                    return generatorOp;
                }
            }
        }
        return null;
    }
}
