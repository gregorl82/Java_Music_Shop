package instruments;

public enum InstrumentType {

    PERCUSSION("Percussion"),
    WOODWIND("Woodwind"),
    STRING("String"),
    BRASS("Brass");

    private String type;

    InstrumentType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
