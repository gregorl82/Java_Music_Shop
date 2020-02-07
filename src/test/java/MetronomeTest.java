import accessories.Metronome;
import accessories.MetronomeType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MetronomeTest {

    private Metronome metronome;

    @Before
    public void before(){
        metronome = new Metronome("2180 Pyramid Metronome", "Wittner", MetronomeType.TRADITIONAL, 35.0, 50.0);
    }

    @Test
    public void hasAModelName(){
        assertEquals("2180 Pyramid Metronome", metronome.getName());
    }

    @Test
    public void hasAMaker(){
        assertEquals("Wittner", metronome.getMaker());
    }

    @Test
    public void hasAMetronomeType(){
        assertEquals("Traditional", metronome.getMetronomeType());
    }

    @Test
    public void hasABoughtPrice(){
        assertEquals(35.0, metronome.getBoughtPrice(), 0.00);
    }

    @Test
    public void hasASellPrice(){
        assertEquals(50.0, metronome.getSellPrice(), 0.00);
    }

    @Test
    public void canChangeSellPrice(){
        metronome.setSellPrice(55.0);
        assertEquals(55.0, metronome.getSellPrice(), 0.00);
    }

    @Test
    public void canGetDescription(){
        String expected = "Name: 2180 Pyramid Metronome, Maker: Wittner, Type: Traditional, Price: £50.00";
        assertEquals(expected, metronome.getDescription());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(15.0, metronome.calculateMarkup(), 0.00);
    }
}
