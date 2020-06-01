package hw12;

import java.util.Arrays;

public class Pensils {
    private PensilColor[] pensilColors ;
    private String brand;
    private int quantity;

    public Pensils(PensilColor[] pensilColors, String brand, int quantity) {
        this.pensilColors = pensilColors;
        this.brand = brand;
        this.quantity = quantity;
    }

    public PensilColor[] getPensilColors() {
        return pensilColors;
    }

    public String getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Pensils{" +
                "pensilColors=" + Arrays.toString(pensilColors) +
                ", brand='" + brand + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
