package Items.Accessories;

import Items.Item;

public abstract class Accessory extends Item {

    private AccessoryType accessoryType;

    public Accessory(String make, String model, double purchasePrice, double sellPrice, AccessoryType accessoryType) {
        super(make, model, purchasePrice, sellPrice);
        this.accessoryType = accessoryType;
    }

    public AccessoryType getAccessoryType() {
        return accessoryType;
    }

    public void setAccessoryType(AccessoryType accessoryType) {
        this.accessoryType = accessoryType;
    }
}
