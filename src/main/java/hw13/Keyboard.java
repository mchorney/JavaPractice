package hw13;

public class Keyboard {
    private Brands brand;
    private lights lights;
    private wireType wire;

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public hw13.lights getLights() {
        return lights;
    }

    public void setLights(hw13.lights lights) {
        this.lights = lights;
    }

    public wireType getWire() {
        return wire;
    }

    public void setWire(wireType wire) {
        this.wire = wire;
    }

    public Keyboard(Brands brand, hw13.lights lights, wireType wire) {
        this.brand = brand;
        this.lights = lights;
        this.wire = wire;

    }

    public void printInfo() {
        System.out.println("Brand of Keyboard = " + brand + " Lights = " + lights + " WireType = " + wire);
    }
}
