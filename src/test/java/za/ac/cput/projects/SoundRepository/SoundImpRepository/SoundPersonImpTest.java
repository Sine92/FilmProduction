package za.ac.cput.projects.SoundRepository.SoundImpRepository;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Sound.SoundFactories.SoundPersonFactory;
import za.ac.cput.projects.Sound.SoundPerson;
import za.ac.cput.projects.SoundRepository.SoundPersonRepository;

import static org.junit.Assert.*;

public class SoundPersonImpTest {
    private SoundPersonRepository soundPersonRepository;
    private SoundPerson soundPerson;
    @Before
    public void setUp() throws Exception {
        soundPersonRepository = SoundPersonImp.getSoundPersonImp();
        soundPerson = SoundPersonFactory.createSP("William","265",450.00);
    }

    @Test
    public void getAll() {
        assertEquals(soundPersonRepository.getAll(),soundPersonRepository.getAll());
    }

    @Test
    public void create() {
        assertEquals(soundPersonRepository.create(soundPerson),soundPersonRepository.create(soundPerson));
    }

    @Test
    public void delete() {
        soundPersonRepository.delete(soundPerson.getSpName());
    }

    @Test
    public void update() {
        assertEquals(soundPersonRepository.update(soundPerson),soundPersonRepository.update(soundPerson));
    }

    @Test
    public void read() {
        assertEquals(soundPersonRepository.read(soundPerson),soundPersonRepository.read(soundPerson));
    }
}