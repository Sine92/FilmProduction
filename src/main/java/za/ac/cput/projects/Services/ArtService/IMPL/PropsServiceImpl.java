package za.ac.cput.projects.Services.ArtService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Art.Props;
import za.ac.cput.projects.Repositories.ArtRepository.ArtImplRepository.PropsImpl;
import za.ac.cput.projects.Services.ArtService.PropsService;

import java.util.Set;
@Service("PropsServiceImpl")
public class PropsServiceImpl implements PropsService {

    @Autowired

    private PropsServiceImpl service = null;
    //@Qualifier("PropsServiceImpl")
    private PropsImpl propsRepo;



    @Override
    public Props create(Props props) {
        return propsRepo.create(props);
    }

    @Override
    public Props update(Props props) {
        return propsRepo.update(props);
    }

    @Override
    public void delete(String s) {
        propsRepo.delete(s);
    }

    @Override
    public Props read(String s) {
        return propsRepo.read(s);
    }

    @Override
    public Set<Props> getAll() {
        return propsRepo.getAllPr();
    }
}
