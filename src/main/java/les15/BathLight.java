package les15;

public class BathLight extends Lights implements Plug, Bulb{
    private String brand;
    private String model;
    private int price;

    public BathLight( String brand, String model, int price,int lumen) {
        super(lumen);
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public void e27(){
        System.out.println("E27 interface implemented");
    }

    @Override
    public void plugDimension() {
        System.out.println("Plug Dimensions Implemented");
    }
}
