package hw13_Computer;

public class Monitor {
    private NameOfBrand brand;
    private TypeOfMonitor type;
    private String resolution;
    private String size;

    public Monitor(NameOfBrand brand,TypeOfMonitor type, String resolution,String size) {
        this.brand = brand;
        this.type = type;
        this.resolution = resolution;
        this.size=size;
    }

    public NameOfBrand getBrand() {
        return brand;
    }

    public void setBrand(NameOfBrand brand) {
        this.brand = brand;
    }

    public TypeOfMonitor getType() {
        return type;
    }

    public void setType(TypeOfMonitor type) {
        this.type = type;
    }

    public String getResolution() {
        return resolution;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String printInfo(){
        return "Brand = "+brand+" Type = "+type+" Resolution = "+resolution+" Size = "+size+"\n";
    }
}
