package hw13;

public class Monitor {
    private String brand;
    private String model;
    private MonitorType type;

    public Monitor(String brand, String model, MonitorType type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public MonitorType getType() {
        return type;
    }
    public void setType(MonitorType type) {
        this.type = type;
    }

    public String printInfo(){
        return " :(Brand = " + brand+ ", Model = "+ model+ ", Type = "+ type +")";

    }
}
