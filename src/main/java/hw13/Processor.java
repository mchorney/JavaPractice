package hw13;

public class Processor {
    private Brand brand;
    private String model;


    public Processor(Brand brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String printInfo(){
        return "Processor {Brand = " +brand + ";"+ "Model = "+model + '}';
    }
}
