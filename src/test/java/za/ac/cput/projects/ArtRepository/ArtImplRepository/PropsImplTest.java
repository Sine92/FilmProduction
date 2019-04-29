package za.ac.cput.projects.ArtRepository.ArtImplRepository;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Art.ArtFactories.PropsFactory;
import za.ac.cput.projects.Art.Props;
import za.ac.cput.projects.ArtRepository.PropRepository;

import static org.junit.Assert.*;

public class PropsImplTest {
    private PropRepository propRepository;
    private Props props;
    @Before
    public void setUp() throws Exception {

        propRepository = PropsImpl.getPropRepo();
        props = PropsFactory.ceateProps("Nick","2362",50.00);
    }

    @Test
    public void create() {

        assertEquals(propRepository.create(props),propRepository.create(props));
    }

    @Test
    public void read() {
        assertEquals(propRepository.read(props),propRepository.read(props));
    }

    @Test
    public void update() {
        assertEquals(propRepository.update(props),propRepository.update(props));
    }

    @Test
    public void delete() {
        propRepository.delete(props.getPropsName());
    }

    @Test
    public void getAllPr() {
        assertEquals(propRepository.getAllPr(),propRepository.getAllPr());
    }
}