package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String colour;
    private InstrumentType instrumentType;
    private String material;
    private String maker;
    private double boughtPrice;
    private double sellPrice;

    public Instrument(String colour, String material, String maker, double boughtPrice, double sellPrice) {
        this.colour = colour;
        this.material = material;
        this.maker = maker;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
        this.instrumentType = null;
    }

    public String getColour() {
        return colour;
    }

    public String getInstrumentType() {
        return instrumentType.getType();
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getMaterial() {
        return material;
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

    public void setSellPrice(double sellPrice){
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup(){
        return this.sellPrice - this.boughtPrice;
    }
}
