package za.ac.cput.projects.Services.LightingService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Lighting.Spark;
import za.ac.cput.projects.Repositories.LightingRepository.LightingImpRepository.SparkImp;
import za.ac.cput.projects.Services.LightingService.SparkService;

import java.util.Set;
@Service("SparkServiceImpl")
public class SparkServiceImpl implements SparkService {
    @Autowired
    @Qualifier("SparkServiceImpl")
    private SparkServiceImpl service = null;
    private SparkImp sparkImp;
    @Override
    public Set<Spark> getAll() {
        return sparkImp.getAll();
    }

    @Override
    public Spark create(Spark spark) {
        return sparkImp.create(spark);
    }

    @Override
    public Spark update(Spark spark) {
        return sparkImp.update(spark);
    }

    @Override
    public void delete(String s) {
        sparkImp.delete(s);

    }

    @Override
    public Spark read(String s) {
        return sparkImp.read(s);
    }
}
