package za.ac.cput.projects.Styling.StylingFactories;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Styling.MakeUpAssist;

import static org.junit.Assert.*;

public class MakeUpArtistFactoryTest {
     MakeUpAssist makeUpAssist;
    @Before
    public void setUp() throws Exception {
        makeUpAssist = MakeUpArtistFactory.createMakeUp("Robin","078",1400.00);
    }

    @Test
    public void createMakeUp() {

        assertEquals(makeUpAssist.getMakeUAName(),makeUpAssist.getMakeUAName());
    }
}