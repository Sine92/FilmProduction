package za.ac.cput.projects.LightingRepository.LightingImpRepository;

import za.ac.cput.projects.Lighting.GeneratorOp;
import za.ac.cput.projects.LightingRepository.GenOpRepository;

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
    public GeneratorOp read(GeneratorOp generatorOp) {
        return null;
    }
}
