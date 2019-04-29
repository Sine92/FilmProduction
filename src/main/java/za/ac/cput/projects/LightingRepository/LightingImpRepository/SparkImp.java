package za.ac.cput.projects.LightingRepository.LightingImpRepository;

import za.ac.cput.projects.Lighting.Spark;
import za.ac.cput.projects.LightingRepository.SparkRepository;

import java.util.Set;

public class SparkImp implements SparkRepository {

    private static SparkImp sparkImp= null;
     private Set<Spark> sparkSet;
    public static SparkImp getSparkImp()
    {
        if(sparkImp == null) sparkImp = new SparkImp();
        return sparkImp;
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
    public void delete(String s) {
        sparkSet.removeIf(t->t.getSpName().equals(s));

    }

    @Override
    public Spark update(Spark spark) {
        if(sparkSet.contains(spark))
        {
            for(Spark spark1:sparkSet)
            {
                if(spark1.equals(spark))
                {
                    return spark1;
                }
            }
        }
        return null;
    }

    @Override
    public Spark read(Spark spark) {

        if(sparkImp.sparkSet.contains(spark))
        {
            for(Spark spark1: sparkSet)
            {
                if(spark1.equals(spark))
                {
                    return spark1;
                }
            }
        }
        return null;
    }
}
