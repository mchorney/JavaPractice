package hw13;

public class MotherBoard {
    private String name;
    private Brand brand;

    public MotherBoard(String name, Brand brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public String printInfo(){
        return "MotherBoard {Brand = "+ brand + ";"+ "Name = " +name+ '}';
    }
}
