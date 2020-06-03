package hw14;

public class Bag extends Accessory {
    private BagType type;

    public Bag(BagType type) {
        this.type = type;
    }

    public Bag(Color color, Fabric fabric, int price, BagType type) {
        super(color, fabric, price);
        this.type = type;
    }

    public BagType getType() {
        return type;
    }

    public void setType(BagType type) {
        this.type = type;
    }

    @Override
    public void printMe() {
        System.out.println("Bag: " +
                "color is " + color + "" +
                ", fabric is " + fabric +
                ", price is $" + price +
                ", type is " + type);
    }
}
