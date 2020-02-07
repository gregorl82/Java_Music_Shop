package instruments;

public class Violin extends Instrument {

    private int numberOfStrings;

    public Violin(String colour, String material, String maker, int numberOfStrings) {
        super(colour, material, maker);
        this.numberOfStrings = numberOfStrings;

        setInstrumentType(InstrumentType.STRING);
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String playInstrument() {
        return "Pluck, pluck, pluck!";
    }
}
