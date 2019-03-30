package Instruments.Keys;

import Instruments.Instrument;
import Interfaces.IPlay;

public class Piano extends Instrument implements IPlay {

    private int numberOfKeys;
    private int numberOfPedals;

    public Piano(String section, String make, String model, String sound, String type, String material, String colour, int numberOfKeys, int numberOfPedals) {
        super(section, make, model, type, material, colour, sound);
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
