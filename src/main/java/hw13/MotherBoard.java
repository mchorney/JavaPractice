package hw13;

public class MotherBoard {
    private MotherBtypes MotherBType;
    private Brands brand;

    public MotherBtypes getMotherBType() {
        return MotherBType;
    }

    public void setMotherBType(MotherBtypes motherBType) {
        MotherBType = motherBType;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public MotherBoard(MotherBtypes motherBType, Brands brand) {
        MotherBType = motherBType;
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("Mother Board type = " + MotherBType + " Brand = " + brand);

    }
}
