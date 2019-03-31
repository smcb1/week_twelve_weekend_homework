package Items.Instruments.Stringed;

import Items.Instruments.Instrument;
import Items.Interfaces.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int numberOfStrings;

    public Guitar(String make, String model, double purchasePrice, double sellPrice, String section, String type, String material, String colour, String sound, int numberOfStrings) {
        super(make, model, purchasePrice, sellPrice, section, type, material, colour, sound);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return getSound();
    }
}
