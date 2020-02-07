package instruments;

public class Piano extends Instrument {

    private String pianoType;
    private int numberOfKeys;

    public Piano(String colour, String material, String maker, String pianoType, int numberOfKeys, double boughtPrice, double sellPrice) {
        super(colour, material, maker, boughtPrice, sellPrice);
        this.pianoType = pianoType;
        this.numberOfKeys = numberOfKeys;

        setInstrumentType(InstrumentType.PERCUSSION);
    }

    public String getPianoType() {
        return pianoType;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String playInstrument() {
        return "Plink, plink, plink!";
    }

    public String getDescription() {
        String description = String.format("%s %s piano, Colour: %s, Material: %s, Price: £%.2f", super.getMaker(), this.getPianoType(), super.getColour(), super.getMaterial(), super.getSellPrice());
        return description;
    }
}
