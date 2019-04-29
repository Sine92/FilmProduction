package za.ac.cput.projects.ArtRepository.ArtImplRepository;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Art.ArtDirector;
import za.ac.cput.projects.Art.ArtFactories.ArtDirectorFactory;
import za.ac.cput.projects.ArtRepository.ArtDirectorRepository;

import static org.junit.Assert.*;

public class ArtRepoImplTest {
    private ArtDirectorRepository artDirectorRepository;
    private ArtDirector artDirector;
    @Before
    public void setUp() throws Exception {
        artDirectorRepository = ArtRepoImpl.getArtRepo();
        artDirector = ArtDirectorFactory.createArtDirector("Sarah","5362",10.00);

    }



    @Test
    public void create() {
        assertEquals(artDirectorRepository.create(artDirector),artDirectorRepository.create(artDirector));
    }

    @Test
    public void read() {
        assertEquals(artDirectorRepository.read(artDirector),artDirectorRepository.read(artDirector));
    }

    @Test
    public void update() {
        assertEquals(artDirectorRepository.update(artDirector),artDirectorRepository.update(artDirector));
    }

    @Test
    public void delete() {
        artDirectorRepository.delete(artDirector.getArtDirectorName());
    }

    @Test
    public void getAll() {
        assertEquals(artDirectorRepository.getAll(),artDirectorRepository.getAll());

    }
}