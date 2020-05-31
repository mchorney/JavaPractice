package l13;

import java.util.Arrays;

public class MotherBoard {

    private Brand brand;
    private String[] info;

    public MotherBoard(Brand brand, String[] info) {
        this.brand = brand;
        this.info = info;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String[] getInfo() {
        return info;
    }

    public void setInfo(String[] info) {
        this.info = info;
    }

    public String printInfo() {
        return "Motherboard brand: " + getBrand() + ". Motherboard info: " + Arrays.toString(getInfo()) + ".";
    }
}
