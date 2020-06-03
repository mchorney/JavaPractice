package hw14;

public class Belt extends Accessory {
    private Size size;

    public Belt(Size size) {
        this.size = size;
    }

    public Belt(Color color, Fabric fabric, int price, Size size) {
        super(color, fabric, price);
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void printMe() {
        System.out.println("Belt: " +
                "color is " + color +
                ", fabric is " + fabric +
                ", price is $" + price +
                ", size is " + size);
    }
}
