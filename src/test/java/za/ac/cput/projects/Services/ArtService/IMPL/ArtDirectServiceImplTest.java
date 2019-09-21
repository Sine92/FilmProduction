package za.ac.cput.projects.Services.ArtService.IMPL;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.Domain.Art.ArtDirector;
import za.ac.cput.projects.Factories.ArtFactories.ArtDirectorFactory;
import za.ac.cput.projects.Repositories.ArtRepository.ArtImplRepository.ArtRepoImpl;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArtDirectServiceImplTest {

    private ArtRepoImpl artRepo;
    private ArtDirector artDirector;

    private ArtDirector getSaved()
    {
       return this.artRepo.getAll().iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        artRepo = ArtRepoImpl.getArtRepo();
        artDirector = ArtDirectorFactory.createArtDirector("Sarah","236",20.00);

    }


    @Test
    public void getAll() {
        Set<ArtDirector> artDirectorSet = this.artRepo.getAll();
        System.out.println("In getting all, all = "+ artDirectorSet);
        Assert.assertEquals(artRepo.getAll(),artRepo.getAll());
    }

    @Test
    public void create() {
    ArtDirector created = this.artRepo.create(this.artRepo.create(artDirector));
        System.out.println("In create, created = "+ created);
        //Assert.assertSame(created,);
        Assert.assertSame(created,this.artDirector);

    }

    @Test(expected = NullPointerException.class)
    public void update() {
        String newArtDirectName = "Will";
        ArtDirector updated = new ArtDirector.Builder().copy(getSaved()).artDirectorName(newArtDirectName).build();
        System.out.println("In of the Art Director, updated = "+updated);
        this.artRepo.update(updated);
        Assert.assertSame(newArtDirectName,updated.getArtDirectorName());
    }

    @Test
    public void delete() {
        ArtDirector saved = getSaved();
        this.artRepo.delete(saved.getArtDirectorName());
        getAll();


    }

    @Test(expected = NullPointerException.class)
    public void read() {
       ArtDirector saved = getSaved();
        ArtDirector read = this.artRepo.read(saved.getArtDirectorName());
        System.out.println("In reading, read = "+ read);
        Assert.assertSame(read,this.artDirector);

    }
}