package accessories;

public class Metronome extends Accessory {

    private MetronomeType metronomeType;

    public Metronome(String name, String maker, MetronomeType metronomeType) {
        super(name, maker);
        this.metronomeType = metronomeType;
    }

    public String getMetronomeType() {
        return metronomeType.getType();
    }
}
