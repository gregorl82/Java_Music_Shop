import org.junit.Test;
import org.junit.Before;
import sheetmusic.SheetMusic;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    private SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic();
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
}
