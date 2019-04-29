package za.ac.cput.projects.SoundRepository.SoundImpRepository;

import za.ac.cput.projects.Sound.SoundPerson;
import za.ac.cput.projects.SoundRepository.SoundPersonRepository;

import java.util.Set;

public class SoundPersonImp implements SoundPersonRepository {

    private static SoundPersonImp soundPersonImp = null;
    private Set<SoundPerson> soundPersonSet;
    public static SoundPersonImp getSoundPersonImp()
    {
        if(soundPersonImp == null) soundPersonImp = new SoundPersonImp();
        return soundPersonImp;
    }

    @Override
    public Set<SoundPerson> getAll() {
        return soundPersonSet;
    }

    @Override
    public SoundPerson create(SoundPerson soundPerson) {
        this.soundPersonSet.add(soundPerson);
        return soundPerson;

    }

    @Override
    public void delete(String s) {
        soundPersonSet.removeIf(t->t.getSpName().equals(s));

    }

    @Override
    public SoundPerson update(SoundPerson soundPerson) {
        if(soundPersonSet.contains(soundPerson))
        {
            for(SoundPerson soundPerson1: soundPersonSet)
            {
                if(soundPerson1.equals(soundPerson))
                {
                    return soundPerson1;
                }
            }
        }
        return null;
    }

    @Override
    public SoundPerson read(SoundPerson soundPerson) {
        if(soundPersonImp.soundPersonSet.contains(soundPerson))
        {
            for(SoundPerson soundPerson1:soundPersonSet)
            {
                if(soundPerson1.equals(soundPerson))
                {
                    return soundPerson1;
                }
            }
        }
        return null;
    }
}
