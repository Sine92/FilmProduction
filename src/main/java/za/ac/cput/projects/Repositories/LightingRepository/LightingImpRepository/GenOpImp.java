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
    private GeneratorOp findGeneratorOp(String genId){
        return this.generatorOpSet.stream()
                .filter(generatorOp -> generatorOp.getGenId().trim().equals(genId))
                .findAny()
                .orElse(null);
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
    public void delete(String genId) {
        GeneratorOp toDelete = findGeneratorOp(genId);
        if(toDelete!=null){
            this.generatorOpSet.remove(toDelete);
        }

    }

    @Override
    public GeneratorOp update(GeneratorOp generatorOp) {
        GeneratorOp toUpdate = findGeneratorOp(generatorOp.getGenId());
        if(toUpdate!=null){
            this.generatorOpSet.remove(toUpdate);
            return create(generatorOp);
        }
        return null;
    }

    @Override
    public GeneratorOp read(String genId)
    {
       GeneratorOp generatorOp = findGeneratorOp(genId);
       return generatorOp;
    }
}
