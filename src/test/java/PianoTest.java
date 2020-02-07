import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void before(){
        piano = new Piano("Mahogany", "Hardwood", "Steinway", "Grand", 72, 18500.0, 23950.0);
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
        assertEquals("Keyboard", piano.getInstrumentType());
    }

    @Test
    public void hasAPianoType(){
        assertEquals("Grand", piano.getPianoType());
    }

    @Test
    public void hasANumberOfKeys(){
        assertEquals(72, piano.getNumberOfKeys());
    }

    @Test
    public void hasABoughtPrice(){
        assertEquals(18500.0, piano.getBoughtPrice(), 0.01);
    }

    @Test
    public void hasASellPrice(){
        assertEquals(23950.0, piano.getSellPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        piano.setSellPrice(22500.0);
        assertEquals(22500.0, piano.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(5450.0, piano.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("Plink, plink, plink!", piano.playInstrument());
    }

    @Test
    public void canGetDescription(){
        String expected = "Steinway Grand piano, Colour: Mahogany, Material: Hardwood, Price: £23950.00";
        assertEquals(expected, piano.getDescription());
    }
}
