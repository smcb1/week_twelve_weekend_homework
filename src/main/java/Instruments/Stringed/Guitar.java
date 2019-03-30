package Instruments.Stringed;

import Instruments.Instrument;
import Interfaces.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int numberOfStrings;

    public Guitar(String section, String make, String model, String sound, String type, String material, String colour, int numberOfStrings, double purchasePrice, double salePrice) {
        super(section, make, model, type, material, colour, sound, purchasePrice, salePrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return getSound();
    }
}
