package Items.Instruments.Keys;

import Items.Instruments.Instrument;
import Items.Interfaces.IPlay;

public class Piano extends Instrument implements IPlay {

    private int numberOfKeys;
    private int numberOfPedals;

    public Piano(String make, String model, double purchasePrice, double sellPrice, String section, String type, String material, String colour, String sound, int numberOfKeys, int numberOfPedals) {
        super(make, model, purchasePrice, sellPrice, section, type, material, colour, sound);
        this.numberOfKeys = numberOfKeys;
        this.numberOfPedals = numberOfPedals;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public int getNumberOfPedals() {
        return numberOfPedals;
    }

    public String play() {
        return getSound();
    }
}
