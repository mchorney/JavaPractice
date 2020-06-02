package hw13;

public class Monitor {
    private String type;
    private String model;
    private Brand brand;

    public Monitor(String type, String model, Brand brand) {
        this.type = type;
        this.model = model;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void printInfo(){
        System.out.println("Brand = " + brand + ", Model = " + model + ", Type = " + type);
    }

    public String toPrintMonitor() {
        return "Brand = " + brand + ", Model = " + model + ", Type = " + type;
    }
}
