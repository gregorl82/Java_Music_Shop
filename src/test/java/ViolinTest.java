import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    private Violin violin;

    @Before
    public void before(){
        violin = new Violin("Varnish", "Wood", "Stradivarius", 4, 1200.0, 1450.0);
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
    public void hasABoughtPrice(){
        assertEquals(1200.0, violin.getBoughtPrice(), 0.01);
    }

    @Test
    public void hasASellPrice(){
        assertEquals(1450.0, violin.getSellPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        violin.setSellPrice(1400.0);
        assertEquals(1400.0, violin.getSellPrice(), 0.01);
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("Pluck, pluck, pluck!", violin.playInstrument());
    }

    @Test
    public void canGetDescription(){
        String expected = "Stradivarius violin, Colour: Varnish, Material: Wood, Price: £1450.00";
        assertEquals(expected, violin.getDescription());
    }
}
