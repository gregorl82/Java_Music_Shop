package instruments;

public class Clarinet extends Instrument {

    public Clarinet(String colour, String material, String maker, double boughtPrice, double sellPrice) {
        super(colour, material, maker, boughtPrice, sellPrice);

        setInstrumentType(InstrumentType.WOODWIND);
    }

    public String playInstrument() {
        return "Toot, toot, toot!";
    }

    public String getDescription() {
        String description = String.format("%s clarinet, Colour: %s, Material: %s, Price: £%.2f", super.getMaker(), super.getColour(), super.getMaterial(), super.getSellPrice());
        return description;
    }
}
