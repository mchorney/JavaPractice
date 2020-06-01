package hw13;

public class Monitor {
    private String name;
    private int productionYear;
    private MonitorType monitorType;
    private DeviceColor deviceColor;

    public Monitor(String name, int productionYear, MonitorType monitorType, DeviceColor deviceColor) {
        this.name = name;
        this.productionYear = productionYear;
        this.monitorType = monitorType;
        this.deviceColor = deviceColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public MonitorType getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(MonitorType monitorType) {
        this.monitorType = monitorType;
    }

    public DeviceColor getDeviceColor() {
        return deviceColor;
    }

    public void setDeviceColor(DeviceColor deviceColor) {
        this.deviceColor = deviceColor;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                ", monitorType=" + monitorType +
                ", deviceColor=" + deviceColor +
                '}';
    }
    public void printInfo(){
        System.out.println(toString());
    }
}
