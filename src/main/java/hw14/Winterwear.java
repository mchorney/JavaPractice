package hw14;

import jdk.jshell.TypeDeclSnippet;

import java.util.Arrays;

public class Winterwear extends Clothes {
    public Winterwear(String brand, String model, Types[] type, Colors[] color, int collectionOfyear, MadeIn madeIn) {
        super(brand, model, type, color, collectionOfyear, madeIn);
    }

    @Override
    public String toString() {
        return "Winterwear{" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", type=" + Arrays.toString(type) +
            ", color=" + Arrays.toString(color) +
            ", collectionOfyear=" + collectionOfyear +
            ", madeIn=" + madeIn +
            '}';
    }
}
