package hw14;

import java.util.Arrays;

public class Springwear extends Clothes {
    public Springwear(String brand, String model, Types[] type, Colors[] color, int collectionOfyear, MadeIn madeIn) {
        super(brand, model, type, color, collectionOfyear, madeIn);
    }

    @Override
    public String toString() {
        return "Springwear{" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", type=" + Arrays.toString(type) +
            ", color=" + Arrays.toString(color) +
            ", collectionOfyear=" + collectionOfyear +
            ", madeIn='" + madeIn + '\'' +
            '}';
    }
}
