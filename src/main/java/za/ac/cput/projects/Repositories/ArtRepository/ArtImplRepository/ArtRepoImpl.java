package za.ac.cput.projects.Repositories.ArtRepository.ArtImplRepository;

import za.ac.cput.projects.Domain.Art.ArtDirector;
import za.ac.cput.projects.Repositories.ArtRepository.ArtDirectorRepository;

import java.util.HashSet;
import java.util.Set;

public class ArtRepoImpl implements ArtDirectorRepository {

    private static ArtRepoImpl artRepo= null;

    private Set<ArtDirector> artDirectorSet;

    public ArtRepoImpl()
    {
     this.artDirectorSet = new HashSet<>();
    }
    public static ArtRepoImpl getArtRepo(){
        if (artRepo == null) artRepo = new ArtRepoImpl();
        return artRepo;
    }
    public ArtDirector create(ArtDirector artDirector)
    {
        this.artDirectorSet.add(artDirector);
        return artDirector;
    }
    public ArtDirector read(String artDName)
    {
        if(artRepo.artDirectorSet.contains(artDName))
        {
            for(ArtDirector artId1 : artDirectorSet)
            {
               if( artId1.equals(artDName))
                return artId1;
            }
        }
        return null;
    }

    public ArtDirector update(ArtDirector artDirector)
    {
        if(artDirectorSet.contains(artDirector))
            for(ArtDirector artDirector1: artDirectorSet)
            {
                if(artDirector1.equals(artDirector))
                    return artDirector;
            }
       return null;
    }

    @Override
    public void delete(String artDName) {
      artDirectorSet.removeIf(t ->t.getArtDirectorName().equals(artDName));
    }



    public Set<ArtDirector> getAll()
    {
        return this.artDirectorSet;
    }

}
