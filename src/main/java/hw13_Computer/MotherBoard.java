package hw13_Computer;

public class MotherBoard {
    private TypeOfMotherboard tom;
    private NameOfBrand brand;

    public MotherBoard(TypeOfMotherboard tom, NameOfBrand brand) {
        this.tom = tom;
        this.brand = brand;
    }

    public TypeOfMotherboard getTom() {
        return tom;
    }

    public void setTom(TypeOfMotherboard tom) {
        this.tom = tom;
    }

    public NameOfBrand getBrand() {
        return brand;
    }

    public void setBrand(NameOfBrand brand) {
        this.brand = brand;
    }

    public String printInfo(){
        return "Brand = "+brand+" Type = "+tom;
    }
}
