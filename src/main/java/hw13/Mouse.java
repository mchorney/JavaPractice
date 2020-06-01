package hw13;

public class Mouse {
    private Brands brand;
    private colors color;
    private wireType wire;

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public colors getColor() {
        return color;
    }

    public void setColor(colors color) {
        this.color = color;
    }

    public wireType getWire() {
        return wire;
    }

    public void setWire(wireType wire) {
        this.wire = wire;
    }

    public Mouse(Brands brand, colors color, wireType wire) {
        this.brand = brand;
        this.color = color;
        this.wire = wire;
    }

    public void printInfo() {
        System.out.println("Mouse Brand = " + brand + " Color=" + color + " Wire Type = " + wire);
    }
}


