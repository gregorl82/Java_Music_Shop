package accessories;

public class ViolinString extends Accessory {

    private String note;
    private String material;

    public ViolinString(String name, String maker, String note, String material, double boughtPrice, double sellPrice) {
        super(name, maker, boughtPrice, sellPrice);
        this.note = note;
        this.material = material;
    }

    public String getNote() {
        return note;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String getDescription() {
        String description = String.format("Name: %s, Maker: %s, Note: %s, Material: %s, Price: £%.2f", super.getName(), super.getMaker(), this.note, this.material, super.getSellPrice());
        return description;
    }
}
