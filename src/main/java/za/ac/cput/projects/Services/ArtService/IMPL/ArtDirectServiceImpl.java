package za.ac.cput.projects.Services.ArtService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Art.ArtDirector;
import za.ac.cput.projects.Repositories.ArtRepository.ArtDirectorRepository;
import za.ac.cput.projects.Repositories.ArtRepository.ArtImplRepository.ArtRepoImpl;
import za.ac.cput.projects.Services.ArtService.ArtDirectService;

import java.util.Set;
@Service("ArtDirectServiceImpl")

public class ArtDirectServiceImpl implements ArtDirectService {



    @Autowired
    private ArtDirectServiceImpl service = null;
    //@Qualifier("InMemory")

    private ArtRepoImpl artRepo;

    private ArtDirectServiceImpl()
    {
        this.artRepo = ArtRepoImpl.getArtRepo();
    }

    public  ArtDirectServiceImpl getService()
    {
        if(service == null)service = new ArtDirectServiceImpl();
        return service;
    }
    @Override
    public Set<ArtDirector> getAll() {
        return this.artRepo.getAll();
    }

    @Override
    public ArtDirector create(ArtDirector artDirector) {
        return this.artRepo.create(artDirector);
    }

    @Override
    public ArtDirector update(ArtDirector artDirector) {
        return this.artRepo.update(artDirector);
    }

    @Override
    public void delete(String s) {
         this.artRepo.delete(s);

    }

    @Override
    public ArtDirector read(String s) {
        return this.artRepo.read(s);
    }
}
