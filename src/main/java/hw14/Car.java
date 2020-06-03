package hw14;

public class Car extends Vehicle {
    private int door;
    private String type;
    protected String poweredBy;

    public Car(int wheels, boolean steeringWheel, Brand brand, int door, String type, String poweredBy) {
        super(wheels, steeringWheel, brand);
        this.door = door;
        this.type = type;
        this.poweredBy = poweredBy;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPoweredBy() {
        return poweredBy;
    }

    public void setPoweredBy(String poweredBy) {
        this.poweredBy = poweredBy;
    }

    @Override
    public void printOut() {
        System.out.println("Do you want to by a car?");
    }
}
