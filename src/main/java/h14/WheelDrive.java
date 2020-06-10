package h14;

public class WheelDrive extends Drive {
    protected int numberOfwheels;

    public WheelDrive(int numberOfwheels) {
        this.numberOfwheels = numberOfwheels;
    }

    public WheelDrive(String typeDrive, int numberOfwheels) {
        super(typeDrive);
        this.numberOfwheels = numberOfwheels;
    }

    public WheelDrive(String name, String type, String typeDrive, int numberOfwheels) {
        super(name, type, typeDrive);
        this.numberOfwheels = numberOfwheels;
    }

    public int getNumberOfwheels() {
        return numberOfwheels;
    }

    public void setNumberOfwheels(int numberOfwheels) {
        this.numberOfwheels = numberOfwheels;
    }

    @Override
    public String toString() {
        return "WheelDrive{" +
                "numberOfwheels=" + numberOfwheels +
                ", typeDrive='" + typeDrive + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
