package instruments;

public class Clarinet extends Instrument {

    public Clarinet(String colour, String material, String maker) {
        super(colour, material, maker);

        setInstrumentType(InstrumentType.WOODWIND);
    }
}
