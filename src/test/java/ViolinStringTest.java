import accessories.StringNote;
import accessories.ViolinString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinStringTest {

    private ViolinString violinString;

    @Before
    public void before(){
        violinString = new ViolinString("Astrea 2433", "Astrea", StringNote.D, "Steel", 3.2, 4.75);
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
    public void hasABoughtPrice(){
        assertEquals(3.2, violinString.getBoughtPrice(), 0.01);
    }

    @Test
    public void hasASellPrice(){
        assertEquals(4.75, violinString.getSellPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        violinString.setSellPrice(5.25);
        assertEquals(5.25, violinString.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(1.55, violinString.calculateMarkup(), 0.01);
    }

    @Test
    public void hasANote(){
        assertEquals("D", violinString.getNote());
    }

    @Test
    public void hasAMaterial(){
        assertEquals("Steel", violinString.getMaterial());
    }

    @Test
    public void canGetDescription(){
        String expected = "Name: Astrea 2433, Maker: Astrea, Note: D, Material: Steel, Price: £4.75";
        assertEquals(expected, violinString.getDescription());
    }

}
