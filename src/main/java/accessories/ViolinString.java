package accessories;

public class ViolinString extends Accessory {

    private String note;
    private String material;

    public ViolinString(String name, String maker, String note, String material) {
        super(name, maker);
        this.note = note;
        this.material = material;
    }

    public String getNote() {
        return note;
    }

    public String getMaterial() {
        return material;
    }
}
