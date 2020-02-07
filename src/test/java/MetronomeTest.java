import accessories.Metronome;
import accessories.MetronomeType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MetronomeTest {

    private Metronome metronome;

    @Before
    public void before(){
        metronome = new Metronome("2180 Pyramid Metronome", "Wittner", MetronomeType.TRADITIONAL);
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
}
