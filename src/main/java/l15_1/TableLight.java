package l15_1;

public class TableLight extends Lights implements Plug, Bulb{
    private String brand;
    private String model;
    private int price;

    public TableLight(String brand, String model, int price, int lumen) {
        super(lumen);
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    @Override
    public void e27(){
        System.out.println("E27 interface implemeted for TableLight");
    }
    @Override
    public void plugDimentions(){
        System.out.println("Plug Dimentions Implemented");
    }
}
