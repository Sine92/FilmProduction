package za.ac.cput.projects.Repositories.ArtRepository.ArtImplRepository;

import za.ac.cput.projects.Domain.Art.PropMaster;
import za.ac.cput.projects.Domain.Art.Props;
import za.ac.cput.projects.Repositories.ArtRepository.PropRepository;

import java.util.HashSet;
import java.util.Set;

public class PropsImpl implements PropRepository {

    private static PropsImpl propRepo = null;

    private Set<Props> propsList;

    public static PropsImpl getPropRepo()
    {
        if(propRepo == null)propRepo = new PropsImpl();
            return propRepo;

    }
    private Props findProps(String propId)
    {
      return this.propsList.stream()
      .filter(props -> props.getPropId().trim().equals(propId))
              .findAny()
              .orElse(null);
    }

    private PropsImpl(){

     this.propsList = new HashSet<>();
    }

   public Props create(Props props)
    {
      this.propsList.add(props);
      return props;

    }
    public Props read(String propId)
    {
       Props props = findProps(propId);
       return props;
    }
    public Props update(Props props)
    {
        Props toUpdate = findProps(props.getPropId());
        if(toUpdate!=null){
            this.propsList.remove(toUpdate);
            return create(props);
        }
        return null;
    }
    public void delete(String propsId)
    {
        Props toDelete = findProps(propsId);
        if(toDelete!=null){
            this.propsList.remove(toDelete);
        }

    }
    @Override
    public Props displayBy(String ppRole)
    {
        return this.propsList.stream()
                .filter(props -> props.getPpRole().equalsIgnoreCase(ppRole))
                .findAny()
                .orElse(null);
    }
    public Set<Props> getAllPr()
    {
        return this.propsList;
    }

}
