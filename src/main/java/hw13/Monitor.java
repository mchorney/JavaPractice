package hw13;

public class Monitor {
    private Brand brand;
    private double resolution;
    private double size;
    private MonitorType type;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public MonitorType getType() {
        return type;
    }

    public void setType(MonitorType type) {
        this.type = type;
    }

    public Monitor(Brand brand, double resolution, double size, MonitorType type) {
        this.brand = brand;
        this.resolution = resolution;
        this.size = size;
        this.type = type;



    }

    public String printInfo(){
        return "Monitor {Brand = "+brand + ";" + "Resolution = "+resolution + ";"+ "Size = "+ size + ";" + "Monitor Type ="+ type + '}';
    }
}
