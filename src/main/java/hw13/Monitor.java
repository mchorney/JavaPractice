package hw13;

public class Monitor {
    private int size;
    private MonitorType MonitorType;
    private Brands brand;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public hw13.MonitorType getMonitorType() {
        return MonitorType;
    }

    public void setMonitorType(hw13.MonitorType monitorType) {
        MonitorType = monitorType;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public Monitor(int size, hw13.MonitorType monitorType, Brands brand) {
        this.size = size;
        MonitorType = monitorType;
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("Monitor Size = " + size + " Monitor Type = " + MonitorType + " Brand = " + brand);
    }
}
