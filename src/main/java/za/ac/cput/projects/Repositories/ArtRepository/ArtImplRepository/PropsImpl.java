package za.ac.cput.projects.Repositories.ArtRepository.ArtImplRepository;

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

    private PropsImpl(){

     this.propsList = new HashSet<>();
    }

   public Props create(Props props)
    {
      this.propsList.add(props);
      return props;

    }
    public Props read(String s)
    {
       if(propRepo.propsList.contains(s))
       {
           for(Props p1: propsList)
           {
               if(p1.equals(s))
                   return p1;
           }
       }
        return null;
    }
    public Props update(Props props)
    {
        if(propsList.contains(props))
        {
            for(Props props1 : propsList)
            {
                if(props1.equals(props))
                    return props1;
            }
        }

        return props;
    }
    public void delete(String propsId)
    {
        propsList.removeIf(t ->t.getPropsName().equals(propsId));

    }
    public Set<Props> getAllPr()
    {
        return this.propsList;
    }

}
