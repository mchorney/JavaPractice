package l13;

import java.util.Arrays;

public class Monitor {

    private Brand brand;
    private MonitorSize monitorSize;
    private MonitorResolution monitorResolution;
    private ConnectionType[] connectionType;

    public Monitor(Brand brand, MonitorSize monitorSize, MonitorResolution monitorResolution, ConnectionType[] connectionType) {
        this.brand = brand;
        this.monitorSize = monitorSize;
        this.monitorResolution = monitorResolution;
        this.connectionType = connectionType;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public MonitorSize getMonitorSize() {
        return monitorSize;
    }

    public void setMonitorSize(MonitorSize monitorSize) {
        this.monitorSize = monitorSize;
    }

    public MonitorResolution getMonitorResolution() {
        return monitorResolution;
    }

    public void setMonitorResolution(MonitorResolution monitorResolution) {
        this.monitorResolution = monitorResolution;
    }

    public ConnectionType[] getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(ConnectionType[] connectionType) {
        this.connectionType = connectionType;
    }

    public String printInfo() {
        return "Monitor brand: " + getBrand() + ". Monitor size: " + getMonitorSize() + ". Monitor resolution: " + getMonitorResolution() + ". Monitor connection type: " + Arrays.toString(getConnectionType()) + ".";
    }

}
