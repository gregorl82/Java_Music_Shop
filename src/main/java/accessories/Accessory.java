package accessories;

public abstract class Accessory {

    private String name;
    private String maker;

    public Accessory(String name, String maker) {
        this.name = name;
        this.maker = maker;
    }

    public String getName() {
        return name;
    }

    public String getMaker() {
        return maker;
    }
}
