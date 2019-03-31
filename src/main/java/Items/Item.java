package Items;

public abstract class Item {

    private String make;
    private String model;
    private double purchasePrice;
    private double sellPrice;

    public Item(String make, String model, double purchasePrice, double sellPrice) {
        this.make = make;
        this.model = model;
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
}
