package za.ac.cput.projects.Repositories.LightingRepository.LightingImpRepository;

import za.ac.cput.projects.Domain.Lighting.Spark;
import za.ac.cput.projects.Repositories.LightingRepository.SparkRepository;

import java.util.Set;

public class SparkImp implements SparkRepository {

    private static SparkImp sparkImp= null;
     private Set<Spark> sparkSet;
    public static SparkImp getSparkImp()
    {
        if(sparkImp == null) sparkImp = new SparkImp();
        return sparkImp;
    }
    private Spark findSpark(String spId)
    {
        return this.sparkSet.stream()
                .filter(spark -> spark.getSpId().trim().equals(spId))
                .findAny()
                .orElse(null);
    }

    @Override
    public Set<Spark> getAll() {
        return sparkSet;
    }

    @Override
    public Spark create(Spark spark) {

        this.sparkSet.add(spark);
        return spark;
    }

    @Override
    public void delete(String spId) {
       Spark toDelete = findSpark(spId);
       if(toDelete!=null){
           this.sparkSet.remove(toDelete);
       }

    }

    @Override
    public Spark update(Spark spark) {
       Spark toUpdate = findSpark(spark.getSpId());
       if(toUpdate!=null){
           this.sparkSet.remove(toUpdate);
           return create(spark);
       }
       return null;
    }

    @Override
    public Spark read(String spId) {

        Spark spark = findSpark(spId);
        return spark;
    }
}
