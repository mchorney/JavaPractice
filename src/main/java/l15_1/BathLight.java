package l15_1;

public class BathLight extends Lights implements Plug, Bulb {
    private String brand;
    private String model;
    private int price;

    public BathLight(String brand, String model, int price, int lumen) {
        super(lumen);
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void e27() {
        System.out.println("E27 interface implemeted for bathLight");
    }

    public void plugDimentions() {
        System.out.println("Plug Dimentions Implemented");
    }
}
