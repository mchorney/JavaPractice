package hw14;

public class Winterwear extends Clothes {
    protected Person manager;

    public Winterwear(String brand, String model, String type, String color, int collectionOfyear, MadeIn madeIn, Person manager) {
        super(brand, model, type, color, collectionOfyear, madeIn);
        this.manager = manager;
    }


}
