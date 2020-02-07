import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinStringTest {

    private ViolinString violinString;

    @Before
    public void before(){
        violinString = new ViolinString("Astrea 2433", "Astrea", "D", "Steel");
    }

    @Test
    public void hasAModelName(){
        assertEquals("Astrea 2433", violinString.getName());
    }

    @Test
    public void hasAMaker(){
        assertEquals("Astrea", violinString.getMaker());
    }

    @Test
    public void hasANote(){
        assertEquals("D", violinString.getNote());
    }

    @Test
    public void hasAMaterial(){
        assertEquals("Steel", violinString.getMaterial());
    }

}
