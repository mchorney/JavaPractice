package hw13;

public class Monitor {
    private MonitorBrands monitorBrands;
    private MonitorType monitorType;
    private Price price;


    public Monitor(MonitorBrands monitorBrands, MonitorType monitorType, Price price) {
        this.monitorBrands = monitorBrands;
        this.monitorType = monitorType;
        this.price = price;
    }

    public MonitorBrands getMonitorBrands() {
        return monitorBrands;
    }

    public void setMonitorBrands(MonitorBrands monitorBrands) {
        this.monitorBrands = monitorBrands;
    }

    public MonitorType getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(MonitorType monitorType) {
        this.monitorType = monitorType;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String printInfo(){
        return "Monitor {Brand = " + monitorBrands + ", Monitor Type = " + monitorType + ", Monitor Price = " + price +'}';
    }
}
