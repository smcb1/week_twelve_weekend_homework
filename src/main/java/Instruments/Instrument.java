package Instruments;

public abstract class Instrument {

    private String section;
    private String make;
    private String model;
    private String type;
    private String material;
    private String colour;
    private String sound;

    public Instrument(String section, String make, String model, String type, String material, String colour, String sound) {
        this.section = section;
        this.make = make;
        this.model = model;
        this.type = type;
        this.material = material;
        this.colour = colour;
        this.sound = sound;
    }

    public String getSection() {
        return section;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
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
