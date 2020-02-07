import instruments.Clarinet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {

    private Clarinet clarinet;

    @Before
    public void before(){
        clarinet = new Clarinet("Black", "Grenadilla wood", "Yamaha", 455.0, 560.0);
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

    @Test
    public void hasABoughtPrice(){
        assertEquals(455.0, clarinet.getBoughtPrice(), 0.01);
    }

    @Test
    public void hasASellPrice(){
        assertEquals(560.0, clarinet.getSellPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        clarinet.setSellPrice(510.0);
        assertEquals(510.0, clarinet.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(105.0, clarinet.calculateMarkup(), 0.01);
    }

    @Test
    public void canGetDescription(){
        String description = "Yamaha clarinet, Colour: Black, Material: Grenadilla wood, Price: £560.00";
        assertEquals(description, clarinet.getDescription());
    }

}
