package za.ac.cput.projects.Services.ArtService;

import za.ac.cput.projects.Domain.Art.Props;
import za.ac.cput.projects.Services.IService;

import java.util.Set;

public interface PropsService extends IService<Props,String> {


    Set<Props> getAll();
}
