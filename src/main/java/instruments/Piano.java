package instruments;

public class Piano extends Instrument {

    private String pianoType;
    private int numberOfKeys;

    public Piano(String colour, String material, String maker, String pianoType, int numberOfKeys) {
        super(colour, material, maker);
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
}
