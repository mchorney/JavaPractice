package hw14;

public class Vehicle {
    protected int wheels;
    protected boolean steeringWheel;
    protected Brand brand;

    public Vehicle(int wheels, boolean steeringWheel, Brand brand) {
        this.wheels = wheels;
        this.steeringWheel = steeringWheel;
        this.brand = brand;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public boolean isSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(boolean steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void printOut() {
        System.out.println("Has " + wheels + " wheels. "  + "Has steering wheel? " + steeringWheel + ". Been produced by " + brand);
    }
}
