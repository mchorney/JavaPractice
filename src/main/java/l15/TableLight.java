package l15;

public class TableLight extends Lights implements Plug, BulbE27 {
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
        System.out.println("E27 interface implemented for Tablelight");
    }

    @Override
    public void hi() {

    }

    @Override
    public String hey(String gg) {
        return null;
    }

    @Override
    public void plugDimentions(){
        System.out.println("Plug Dimentions implemented");
    }
}
