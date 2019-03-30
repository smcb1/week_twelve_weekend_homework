package Instruments.Stringed;

import Instruments.Instrument;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String section, String make, String model, String sound, String type, String material, String colour, int numberOfStrings) {
        super(section, make, model, type, material, colour, sound);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
