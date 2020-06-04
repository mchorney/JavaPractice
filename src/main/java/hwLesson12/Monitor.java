package hwLesson12;

public class Monitor {
    private String brand;
    private String size;
    private MonitorType model;

    public Monitor(String brand, String size, MonitorType model) {
        this.brand = brand;
        this.size = size;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public MonitorType getModel() {
        return model;
    }

    public void setModel(MonitorType model) {
        this.model = model;
    }


    public String printOut() {
        return "Monitor{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", model=" + model +
                '}';
    }


}
