import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    private Violin violin;

    @Before
    public void before(){
        violin = new Violin("Varnish", "Wood", "Stradivarius", 4);
    }

    @Test
    public void hasAColour(){
        assertEquals("Varnish", violin.getColour());
    }

    @Test
    public void hasAMaterial(){
        assertEquals("Wood", violin.getMaterial());
    }

    @Test
    public void hasAMaker(){
        assertEquals("Stradivarius", violin.getMaker());
    }

    @Test
    public void hasAnInstrumentType(){
        assertEquals("String", violin.getInstrumentType());
    }

    @Test
    public void hasANumberOfStrings(){
        assertEquals(4, violin.getNumberOfStrings());
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("Pluck, pluck, pluck!", violin.playInstrument());
    }
}
