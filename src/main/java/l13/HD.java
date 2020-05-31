package l13;

import java.util.Arrays;

public class HD {
    private Brand brand;
    private HDSize hdSize;
    private HDInterface hdInterface;
    private HDType hdType;

    public HD(Brand brand, HDSize hdSize, HDInterface hdInterface, HDType hdType) {
        this.brand = brand;
        this.hdSize = hdSize;
        this.hdInterface = hdInterface;
        this.hdType = hdType;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public HDSize getHdSize() {
        return hdSize;
    }

    public void setHdSize(HDSize hdSize) {
        this.hdSize = hdSize;
    }

    public HDInterface getHdInterface() {
        return hdInterface;
    }

    public void setHdInterface(HDInterface hdInterface) {
        this.hdInterface = hdInterface;
    }

    public HDType getHdType() {
        return hdType;
    }

    public void setHdType(HDType hdType) {
        this.hdType = hdType;
    }

    public String printInfo() {
        return "Hard drive brand: " + getBrand() + ". Hard drive size: " + getHdSize() + ". Hard drive interface: " + getHdInterface() + ". Hard drive type: " + getHdType() + ".";
    }
}
