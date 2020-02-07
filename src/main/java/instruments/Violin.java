package instruments;

public class Violin extends Instrument {

    private int numberOfStrings;

    public Violin(String colour, String material, String maker, int numberOfStrings, double boughtPrice, double sellPrice) {
        super(colour, material, maker, boughtPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;

        setInstrumentType(InstrumentType.STRING);
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String playInstrument() {
        return "Pluck, pluck, pluck!";
    }

    public String getDescription() {
        String description = String.format("%s violin, Colour: %s, Material: %s, Price: £%.2f", super.getMaker(), super.getColour(), super.getMaterial(), super.getSellPrice());
        return description;
    }
}
