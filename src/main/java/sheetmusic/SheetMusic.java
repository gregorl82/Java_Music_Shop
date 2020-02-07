package sheetmusic;

import interfaces.ISell;

public class SheetMusic implements ISell {

    private String title;
    private String composer;
    private String forInstrument;
    private double boughtPrice;
    private double sellPrice;

    public SheetMusic(String title, String composer, String forInstrument, double boughtPrice, double sellPrice) {
        this.title = title;
        this.composer = composer;
        this.forInstrument = forInstrument;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public String getTitle() {
        return title;
    }

    public String getComposer() {
        return composer;
    }

    public String getForInstrument() {
        return forInstrument;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        String description = String.format("Title: %s, Composer: %s, For: %s, Price: £%.2f", this.title, this.composer, this.forInstrument, this.sellPrice);
        return description;
    }

    public double calculateMarkup() {
        return this.sellPrice - this.boughtPrice;
    }
}
