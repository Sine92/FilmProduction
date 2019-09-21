package za.ac.cput.projects.Services.ArtService.IMPL;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.Domain.Art.PropMaster;
import za.ac.cput.projects.Factories.ArtFactories.PropMasterFactory;
import za.ac.cput.projects.Repositories.ArtRepository.ArtImplRepository.PropMasterImpl;
import za.ac.cput.projects.Services.ArtService.PropMasterService;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PropMasterServiceImplTest {

    private PropMasterImpl propMasterRepo;
    private PropMaster propMaster;

    private PropMaster getSaved(){
        return this.propMasterRepo.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

       this.propMasterRepo = PropMasterImpl.getPropMaster();
       this.propMaster = PropMasterFactory.createPropMaster("Nick","5695",100.00);


    }

    @Test
    public void getAll() {
        Set<PropMaster> alls = this.propMasterRepo.getAll();
        propMasterRepo.getAll();
    }

    @Test
    public void create() {
     PropMaster create = this.propMasterRepo.create(this.propMaster);
     assertSame(create,propMasterRepo.create(propMaster));

    }

    @Test
    public void update() {
        PropMaster update = this.propMasterRepo.update(propMaster);
        assertSame(update,propMasterRepo.update(propMaster));
    }

    @Test
    public void delete() {

        propMasterRepo.delete(propMaster.getPropMasterName());
    }

    @Test
    public void read() {
        PropMaster read = this.propMasterRepo.read(propMaster.getPropMasterName());
        assertSame(read,propMasterRepo.read(propMaster.getPropMasterName()));
    }
}