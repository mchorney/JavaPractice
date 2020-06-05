package hw14;

public class Springwear extends Winterwear {
    protected String newWorker;

    public Springwear(String brand, String model, String type, String color, int collectionOfyear, MadeIn madeIn, Person manager, String newWorker) {
        super(brand, model, type, color, collectionOfyear, madeIn, manager);
        this.newWorker = newWorker;
    }
}
