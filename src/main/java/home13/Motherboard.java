package home13;

public class Motherboard {
    private String brand;
    private MotherboardTape type;


    public Motherboard() {
    }

    public Motherboard(String brand,MotherboardTape type){
        this.brand=brand;
        this.type=type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public MotherboardTape getType() {
        return type;
    }

    public void setType(MotherboardTape type) {
        this.type = type;
    }
    public void printInfo(){
        System.out.println("Motherboard brand is "+brand+"Tape is "+type);
    }
}
