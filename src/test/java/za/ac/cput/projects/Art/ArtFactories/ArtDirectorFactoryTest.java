package za.ac.cput.projects.Art.ArtFactories;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Art.ArtDirector;

import static org.junit.Assert.*;

public class ArtDirectorFactoryTest {
    ArtDirector art;
    @Before
    public void setUp() throws Exception {

        art = ArtDirectorFactory.createArtDirector("Will","0125856",230.00);
    }

    @Test
    public void createArtDirector() {
        Assert.assertEquals(art.getArtDirectorName(),art.getArtDirectorName());
    }
}