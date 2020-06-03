package hw14;

public class Bicycle extends Car {
    private int capacity;
    private String material;

    public Bicycle(int wheels, boolean steeringWheel, Brand brand, int door, String type, String poweredBy, int capacity, String material) {
        super(wheels, steeringWheel, brand, door, type, poweredBy);
        this.capacity = capacity;
        this.material = material;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void printOut() {
        System.out.println("Cool bicycle!");
    }
}
