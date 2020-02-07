package accessories;

import interfaces.ISell;

public abstract class Accessory implements ISell {

    private String name;
    private String maker;
    private double boughtPrice;
    private double sellPrice;

    public Accessory(String name, String maker, double boughtPrice, double sellPrice) {
        this.name = name;
        this.maker = maker;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public String getMaker() {
        return maker;
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

    public double calculateMarkup(){
        return this.sellPrice - this.boughtPrice;
    }
}
