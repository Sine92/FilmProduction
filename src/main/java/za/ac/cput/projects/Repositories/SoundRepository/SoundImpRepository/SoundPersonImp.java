package za.ac.cput.projects.Repositories.SoundRepository.SoundImpRepository;

import za.ac.cput.projects.Domain.Sound.SoundPerson;
import za.ac.cput.projects.Repositories.SoundRepository.SoundPersonRepository;

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
    public SoundPerson read(String s) {
        if(soundPersonImp.soundPersonSet.contains(s))
        {
            for(SoundPerson soundPerson1:soundPersonSet)
            {
                if(soundPerson1.equals(s))
                {
                    return soundPerson1;
                }
            }
        }
        return null;
    }
}
