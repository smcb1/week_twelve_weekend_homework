import Items.Instruments.Brass.Trumpet;
import Items.Instruments.Instrument;
import Items.Instruments.Keys.Piano;
import Items.Instruments.Stringed.Guitar;
import Items.Interfaces.ISell;

import java.util.ArrayList;

public class Shop implements ISell {

    private String shopName;
    Guitar guitar;
    Piano piano;
    Trumpet trumpet;
    ArrayList<Instrument> instruments;


    public Shop(String shopName, Guitar guitar, Piano piano, Trumpet trumpet) {
        this.shopName = shopName;
        this.guitar = guitar;
        this.piano = piano;
        this.trumpet = trumpet;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Guitar getGuitar() {
        return guitar;
    }

    public void setGuitar(Guitar guitar) {
        this.guitar = guitar;
    }

    public Piano getPiano() {
        return piano;
    }

    public void setPiano(Piano piano) {
        this.piano = piano;
    }

    public Trumpet getTrumpet() {
        return trumpet;
    }

    public void setTrumpet(Trumpet trumpet) {
        this.trumpet = trumpet;
    }

    public ArrayList<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(ArrayList<Instrument> instruments) {
        this.instruments = instruments;
    }

    public double calculateMarkup() {
        return guitar.getSellPrice() - guitar.getPurchasePrice();
    }
}
