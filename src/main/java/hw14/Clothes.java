package hw14;
public class Clothes {
    protected String brand;
    protected String model;
    protected String type ;
    protected String color;
    protected int collectionOfyear;
    protected MadeIn madeIn;

    public Clothes(String brand, String model, String type, String color, int collectionOfyear, MadeIn madeIn) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.color = color;
        this.collectionOfyear = collectionOfyear;
        this.madeIn = madeIn;
    }

    public void printMe(){
        System.out.println("Clothes{" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", type='" + type + '\'' +
            ", color='" + color + '\'' +
            ", collectionOfyear=" + collectionOfyear +
            ", madeIn=" + madeIn +
            '}');
    }
}






