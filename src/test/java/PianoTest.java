import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void before(){
        piano = new Piano("Mahogany", "Hardwood", "Steinway", "Grand", 72);
    }

    @Test
    public void hasAColour(){
        assertEquals("Mahogany", piano.getColour());
    }

    @Test
    public void hasAMaterial(){
        assertEquals("Hardwood", piano.getMaterial());
    }

    @Test
    public void hasAMaker(){
        assertEquals("Steinway", piano.getMaker());
    }

    @Test
    public void hasAnInstrumentType(){
        assertEquals("Percussion", piano.getInstrumentType());
    }

    @Test
    public void hasAPianoType(){
        assertEquals("Grand", piano.getPianoType());
    }

    @Test
    public void hasANumberOfKeys(){
        assertEquals(72, piano.getNumberOfKeys());
    }
}
