package accessories;

public class Metronome extends Accessory {

    private MetronomeType metronomeType;

    public Metronome(String name, String maker, MetronomeType metronomeType, double boughtPrice, double sellPrice) {
        super(name, maker, boughtPrice, sellPrice);
        this.metronomeType = metronomeType;
    }

    public String getMetronomeType() {
        return metronomeType.getType();
    }

    @Override
    public String getDescription() {
        String description = String.format("Name: %s, Maker: %s, Type: %s, Price: £%.2f", super.getName(), super.getMaker(), getMetronomeType(), super.getSellPrice());
        return description;
    }

}
