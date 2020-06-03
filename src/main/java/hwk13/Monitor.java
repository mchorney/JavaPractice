package hwk13;

public class Monitor {
    private MonitorType type;
    private Brand brand;
    private MonitorSize size;

    public Monitor(){
    }

    public Monitor(MonitorType type, Brand brand, MonitorSize size){
        this.type=type;
        this.brand=brand;
        this.size=size;
    }

    public MonitorType getType() {
        return type;
    }

    public Brand getBrand() {
        return brand;
    }

    public MonitorSize getSize() {
        return size;
    }

    public void setType(MonitorType type) {
        this.type = type;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setSize(MonitorSize size) {
        this.size = size;
    }

    public void printInfo() {
        System.out.println("Monitor{" +
                "type=" + type.name() +
                ", brand=" + brand.name() +
                ", size=" + size.getSize()+
                '}');
    }
}

