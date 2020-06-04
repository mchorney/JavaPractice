package hw14;

import java.util.Arrays;

public class Summerwear extends Clothes {

    public Summerwear(String brand, String model, Types[] type, Colors[] color, int collectionOfyear, MadeIn madeIn) {
        super(brand, model, type, color, collectionOfyear, madeIn);
    }

    @Override
    public String toString() {
        return "Summerwear{" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", type=" + Arrays.toString(type) +
            ", color=" + Arrays.toString(color) +
            ", collectionOfyear=" + collectionOfyear +
            ", madeIn='" + madeIn + '\'' +
            '}';
    }
}
