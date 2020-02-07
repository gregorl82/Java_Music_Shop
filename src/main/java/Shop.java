import instruments.Piano;
import interfaces.ISell;
import sheetmusic.SheetMusic;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<>();
    }

    public int countStock() {
        return this.stock.size();
    }

    public void addStock(ISell item) {
        this.stock.add(item);
    }

    public void removeStock(ISell item) {
        this.stock.remove(item);
    }

    public double calculatePotentialProfit(){
        double potentialProfit = 0;
        for (ISell item : this.stock) {
            potentialProfit += item.calculateMarkup();
        }
        return potentialProfit;
    }
}
