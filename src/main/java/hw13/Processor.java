package hw13;

public class Processor {
    private Brand brand;
    private double clockFrequency;
    private int coreCount;
    private int yearModel;

    public Processor(Brand brand, double clockFrequency, int coreCount, int yearModel) {
        this.brand = brand;
        this.clockFrequency = clockFrequency;
        this.coreCount = coreCount;
        this.yearModel = yearModel;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public double getClockFrequency() {
        return clockFrequency;
    }

    public void setClockFrequency(double clockFrequency) {
        this.clockFrequency = clockFrequency;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(int coreCount) {
        this.coreCount = coreCount;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public void printInfo(){
        System.out.println("Brand = " + getBrand() + " Clock Frequency = " + getClockFrequency()
                + " Core Count = " + getCoreCount() + " Year Model = " + getYearModel());
    }
}
