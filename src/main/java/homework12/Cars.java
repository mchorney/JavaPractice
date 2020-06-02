package homework12;

import java.util.Arrays;

public class Cars {
    private String make;
    private String model;
    private int year;
    private Colors[] colors;

    public Cars(String make, String model, int year, Colors[] colors) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.colors = colors;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Colors[] getColors() {
        return colors;
    }

    @Override
    public String toString() {
        return "Car {" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", colors=" + Arrays.toString(colors) +
                '}';
    }
}
