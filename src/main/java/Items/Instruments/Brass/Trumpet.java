package Items.Instruments.Brass;

import Items.Instruments.Instrument;
import Items.Interfaces.IPlay;

public class Trumpet extends Instrument implements IPlay {

   private int numberOfValves;

    public Trumpet(String make, String model, double purchasePrice, double sellPrice, String section, String type, String material, String colour, String sound, int numberOfValves) {
        super(make, model, purchasePrice, sellPrice, section, type, material, colour, sound);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play() {
        return getSound();
    }
}
