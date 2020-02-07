public abstract class Instrument {

    private String colour;
    private InstrumentType instrumentType;
    private String material;
    private String maker;

    public Instrument(String colour, String material, String maker) {
        this.colour = colour;
        this.material = material;
        this.maker = maker;
    }

    public String getColour() {
        return colour;
    }

    public String getInstrumentType() {
        return instrumentType.getType();
    }

    public String getMaterial() {
        return material;
    }

    public String getMaker() {
        return maker;
    }
}
