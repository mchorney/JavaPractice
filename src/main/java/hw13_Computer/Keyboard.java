package hw13_Computer;

public class Keyboard {
    private NameOfBrand brand;
    private OutputType type;

    public Keyboard(NameOfBrand brand, OutputType type) {
        this.brand = brand;
        this.type = type;
    }

    public NameOfBrand getBrand() {
        return brand;
    }

    public void setBrand(NameOfBrand brand) {
        this.brand = brand;
    }

    public OutputType getType() {
        return type;
    }

    public void setType(OutputType type) {
        this.type = type;
    }

    public String printInfo(){
        return "Brand = "+brand+" Type = "+type+"\n";
    }
}
