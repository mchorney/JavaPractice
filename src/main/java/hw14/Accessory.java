package hw14;

public class Accessory {
    protected Color color;
    protected Fabric fabric;
    protected int price;

    public Accessory() {
    }

    public Accessory(Color color, Fabric fabric, int price) {
        this.color = color;
        this.fabric = fabric;
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printMe() {
        System.out.println("Accessory: color is " + color +
                ", fabric is " + fabric +
                ", price=" + price);
    }
}
