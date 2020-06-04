package hw14;

import java.util.Arrays;

public class Accessories extends Clothes {
    protected String brand;
    protected String model;
    protected Types[] type ;
    protected Colors[] color;
    protected int collectionOfyear;
    protected MadeIn madeIn;

    public Accessories(String brand, String model, Types[] type, Colors[] color, int collectionOfyear, MadeIn madeIn) {
        super(brand, model, type, color, collectionOfyear, madeIn);

    }

    @Override
    public String toString() {
        return "Accessories{" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", type=" + Arrays.toString(type) +
            ", color=" + Arrays.toString(color) +
            ", collectionOfyear=" + collectionOfyear +
            ", madeIn=" + madeIn +
            '}';
    }
}


