package za.ac.cput.projects.Services.SoundService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Sound.SoundPerson;
import za.ac.cput.projects.Repositories.SoundRepository.SoundImpRepository.SoundPersonImp;
import za.ac.cput.projects.Services.SoundService.SoundPersonService;

import java.util.Set;
@Service("ServiceImpl")
public class SoundPersonServiceImpl implements SoundPersonService {
    @Autowired
    @Qualifier("InMemory")
    private SoundPersonImp soundPersonImp;
    @Override
    public Set<SoundPerson> getAll() {
        return soundPersonImp.getAll();
    }

    @Override
    public SoundPerson create(SoundPerson soundPerson) {
        return soundPersonImp.create(soundPerson);
    }

    @Override
    public SoundPerson update(SoundPerson soundPerson) {
        return soundPersonImp.update(soundPerson);
    }

    @Override
    public void delete(String s) {
        soundPersonImp.delete(s);

    }

    @Override
    public SoundPerson read(String s) {
        return soundPersonImp.read(s);
    }
}
