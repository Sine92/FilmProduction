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
    private SoundPerson findSoundPerson(String spId)
    {
        return this.soundPersonSet.stream()
                .filter(soundPerson -> soundPerson.getSpId().trim().equals(spId))
                .findAny()
                .orElse(null);
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
    public void delete(String spId) {
     SoundPerson toDelete = findSoundPerson(spId);
     if(toDelete!=null){
         this.soundPersonSet.remove(toDelete);
     }

    }

    @Override
    public SoundPerson update(SoundPerson soundPerson) {
       SoundPerson toUpdate = findSoundPerson(soundPerson.getSpId());
       if(toUpdate!=null){
           this.soundPersonSet.remove(toUpdate);
           return create(soundPerson);
       }
       return null;
    }

    @Override
    public SoundPerson read(String spId) {
        SoundPerson soundPerson = findSoundPerson(spId);
        return soundPerson;

    }
}
