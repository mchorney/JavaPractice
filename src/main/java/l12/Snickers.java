package l12;

import java.util.Arrays;

public class Snickers {
    private String brand;
    private String model;
    private Colors[] colors;

    public Snickers(String brand, String model, Colors[] colors) {
        this.brand = brand;
        this.model = model;
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Snickers{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colors=" + Arrays.toString(colors) +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Colors[] getColors() {
        return colors;
    }
}
