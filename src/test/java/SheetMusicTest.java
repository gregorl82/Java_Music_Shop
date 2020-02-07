import org.junit.Test;
import org.junit.Before;
import sheetmusic.SheetMusic;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    private SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Eine kleine Nachtmusik", "Wolfgang Amadeus Mozart", "String ensemble", 3.25, 7.5);
    }

    @Test
    public void hasATitle(){
        assertEquals("Eine kleine Nachtmusik", sheetMusic.getTitle());
    }

    @Test
    public void hasAComposer(){
        assertEquals("Wolfgang Amadeus Mozart", sheetMusic.getComposer());
    }

    @Test
    public void hasAnInstrument(){
        assertEquals("String ensemble", sheetMusic.getForInstrument());
    }

    @Test
    public void hasABoughtPrice(){
        assertEquals(3.25, sheetMusic.getBoughtPrice(), 0.01);
    }

    @Test
    public void hasASellPrice(){
        assertEquals(7.50, sheetMusic.getSellPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        sheetMusic.setSellPrice(6.95);
        assertEquals(6.95, sheetMusic.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(4.25, sheetMusic.calculateMarkup(), 0.01);
    }

    @Test
    public void canGetDescription(){
        String expected = "Title: Eine kleine Nachtmusik, Composer: Wolfgang Amadeus Mozart, For: String ensemble, Price: £7.50";
        assertEquals(expected, sheetMusic.getDescription());
    }
}
