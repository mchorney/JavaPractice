package hw11;

import java.util.Arrays;

public class Airplane {
    private String brand;
    private String model;
    private Colors[] colors;

    public Airplane(String brand, String model, Colors[] colors) {
        this.brand = brand;
        this.model = model;
        this.colors = colors;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Colors[] getColors() {
        return colors;
    }

    public void setColors(Colors[] colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Airplane{" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", colors=" + Arrays.toString(colors) +
            '}';
    }
}
