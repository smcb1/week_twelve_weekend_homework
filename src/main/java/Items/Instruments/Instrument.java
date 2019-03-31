package Items.Instruments;

import Items.Item;

public abstract class Instrument extends Item {

    private String section;
    private String type;
    private String material;
    private String colour;
    private String sound;

    public Instrument(String make, String model, double purchasePrice, double sellPrice, String section, String type, String material, String colour, String sound) {
        super(make, model, purchasePrice, sellPrice);
        this.section = section;
        this.type = type;
        this.material = material;
        this.colour = colour;
        this.sound = sound;
    }

    public String getSection() {
        return section;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getSound() {
        return sound;
    }
}
