package les12_13;

import java.util.Arrays;

public class Snickers {
    private String brand;
    private String model;
    private Colors[] colors;

    public Snickers(String b,String m,Colors[] c){
        brand=b;
        model=m;
        colors=c;
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

    @Override
    public String toString() {
        return "Sneakers{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colors=" + Arrays.toString(colors) +
                '}';
    }
}
