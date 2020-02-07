import instruments.Clarinet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {

    private Clarinet clarinet;

    @Before
    public void before(){
        clarinet = new Clarinet("Black", "Grenadilla wood", "Yamaha");
    }

    @Test
    public void hasAColour(){
        assertEquals("Black", clarinet.getColour());
    }

    @Test
    public void hasAMaterial(){
        assertEquals("Grenadilla wood", clarinet.getMaterial());
    }

    @Test
    public void hasAMaker(){
        assertEquals("Yamaha", clarinet.getMaker());
    }

    @Test
    public void hasAnInstrumentType(){
        assertEquals("Woodwind", clarinet.getInstrumentType());
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("Toot, toot, toot!", clarinet.playInstrument());
    }

}
