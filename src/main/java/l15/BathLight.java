package l15;

public class BathLight  extends Lights implements Plug, BulbE27 {
    private String brand;
    private String model;
    private int price;

    public BathLight(String brand, String model, int price, int lumen) {
        super(lumen);
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void e27(){
        System.out.println("E27 interface implemented for bathlight");
    }

    @Override
    public void hi() {

    }

    @Override
    public String hey(String gg) {
        return null;
    }

    public void plugDimentions(){
        System.out.println("Plug Dimentions implemented");
    }

    @Override
    public String mimi(){
        return "mmm";
    }
}
