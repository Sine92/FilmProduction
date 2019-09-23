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

    private ArtDirector findArtDirector(String artId)
    {
        return this.artDirectorSet.stream()
                .filter(artDirector -> artDirector.getArtDirectorName().trim().equals(artId))
                .findAny()
                .orElse(null);
    }
    public ArtDirector create(ArtDirector artDirector)
    {
        this.artDirectorSet.add(artDirector);
        return artDirector;
    }
    public ArtDirector read(String artId)
    {

     ArtDirector artDirector = findArtDirector(artId);
        return artDirector;
    }

    public ArtDirector update(ArtDirector artDirector)
    {
        ArtDirector toUpdate = findArtDirector(artDirector.getArtDirectorName());
        if(toUpdate!=null) {
            this.artDirectorSet.remove(toUpdate);
            return create(artDirector);
        }
return  null;
    }

    @Override
    public void delete(String artId) {

        ArtDirector toDelete = findArtDirector(artId);
        if(toDelete!=null){
            this.artDirectorSet.remove(toDelete);
        }

    }

    @Override
    public ArtDirector displayBy(String artDRole)
    {
       return this.artDirectorSet.stream()
               .filter(artDirector -> artDirector.getArtDRole().equalsIgnoreCase(artDRole)).findAny().orElse(null);
    }

    public Set<ArtDirector> getAll()
    {
        return this.artDirectorSet;
    }

}
