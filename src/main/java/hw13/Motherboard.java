package hw13;

public class Motherboard {
    private Brand brand;
    private int portsAmount;
    private int yearModel;
    private boolean isCompatible;

    public Motherboard(Brand brand, int portsAmount, int yearModel, boolean isCompatible) {
        this.brand = brand;
        this.portsAmount = portsAmount;
        this.yearModel = yearModel;
        this.isCompatible = isCompatible;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getPortsAmount() {
        return portsAmount;
    }

    public void setPortsAmount(int portsAmount) {
        this.portsAmount = portsAmount;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public boolean isCompatible() {
        return isCompatible;
    }

    public void setCompatible(boolean compatible) {
        isCompatible = compatible;
    }

    public void printInfo(){
        System.out.println("Brand = " + brand + " Ports Amount = " + portsAmount
                + " isCompatible = " + isCompatible + " Year Model = " + yearModel);
    }
}
