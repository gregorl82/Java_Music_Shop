import instruments.Piano;
import org.junit.Before;
import org.junit.Test;
import sheetmusic.SheetMusic;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Piano piano;
    private SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Moonlight Sonata", "Ludwig van Beethoven", "Piano", 2.5, 4.5);
        piano = new Piano("Black", "Hardwood", "Yamaha", "Upright", 88, 1700.0, 2245.0);
        shop = new Shop();
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddStock(){
        Piano piano = new Piano("Black", "Hardwood", "Yamaha", "Upright", 88, 1700.0, 2245.0);
        shop.addStock(piano);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(sheetMusic);
        shop.addStock(piano);
        shop.removeStock(sheetMusic);
        assertEquals(1, shop.countStock());
    }
}
