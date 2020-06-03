package hw14;

public final class Plane extends Vehicle {
    private String type;
    private int capacity;

    public Plane(int wheels, boolean steeringWheel, Brand brand, String type, int capacity) {
        super(wheels, steeringWheel, brand);
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void printOut() {
        System.out.println("This is plane!");
    }
}
