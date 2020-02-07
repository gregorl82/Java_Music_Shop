package accessories;

public enum MetronomeType {

    TRADITIONAL("Traditional"),
    DIGITAL("Digital");

    private String type;

    MetronomeType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
