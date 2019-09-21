package za.ac.cput.projects.Services.ArtService.IMPL;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.Domain.Art.Props;
import za.ac.cput.projects.Factories.ArtFactories.PropsFactory;
import za.ac.cput.projects.Repositories.ArtRepository.ArtImplRepository.PropsImpl;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PropsServiceImplTest {
     private PropsImpl propsImpl;
     private Props props;
    @Before
    public void setUp() throws Exception {
         this.propsImpl = PropsImpl.getPropRepo();
         this.props = PropsFactory.ceateProps("Ali","333",10.00);
    }

    @Test
    public void create() {
        Props create = this.propsImpl.create(props);
        assertSame(create,propsImpl.create(props));
    }

    @Test
    public void update() {
        Props update = this.propsImpl.update(props);
        assertSame(update,propsImpl.update(props));
    }

    @Test
    public void delete() {

        propsImpl.delete(props.getPropsName());
    }

    @Test
    public void read() {
        Props read = this.propsImpl.read(props.getPropsName());
        assertSame(read,propsImpl.read(props.getPropsName()));
    }

    @Test
    public void getAll() {

        Set<Props> all = this.propsImpl.getAllPr();
        assertSame(all,propsImpl.getAllPr());

    }
}