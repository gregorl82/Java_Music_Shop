import accessories.Metronome;
import accessories.MetronomeType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;
import sheetmusic.SheetMusic;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Piano piano;
    private SheetMusic sheetMusic;
    private Metronome metronome;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Moonlight Sonata", "Ludwig van Beethoven", "Piano", 2.5, 4.5);
        piano = new Piano("Black", "Hardwood", "Yamaha", "Upright", 88, 1700.0, 2245.0);
        metronome = new Metronome("MT41", "Wittner", MetronomeType.DIGITAL, 25.0, 34.0);
        shop = new Shop();
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddStock(){
        shop.addStock(piano);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canAddStockOfAllTypes(){
        shop.addStock(piano);
        shop.addStock(metronome);
        shop.addStock(sheetMusic);
        assertEquals(3, shop.countStock());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(sheetMusic);
        shop.addStock(piano);
        shop.removeStock(sheetMusic);
        assertEquals(1, shop.countStock());
    }

}
