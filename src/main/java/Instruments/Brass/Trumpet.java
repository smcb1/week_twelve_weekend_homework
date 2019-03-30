package Instruments.Brass;

import Instruments.Instrument;
import Interfaces.IPlay;

public class Trumpet extends Instrument implements IPlay {

   private int numberOfValves;

    public Trumpet(String section, String make, String model, String sound, String type, String material, String colour, int numberOfValves, double purchasePrice, double salePrice) {
        super(section, make, model, type, material, colour, sound, purchasePrice, salePrice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play() {
        return getSound();
    }
}
