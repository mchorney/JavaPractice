package hw13;

public class Monitor {
    private MonitorBrands monitorBrands;
    private int size;
    private int brightness;


    public Monitor(MonitorBrands monitorBrands, int size, int brightness) {
        this.monitorBrands = monitorBrands;
        this.size = size;
        this.brightness = brightness;
    }

    public MonitorBrands getMonitorBrands() {
        return monitorBrands;
    }

    public void setMonitorBrands(MonitorBrands monitorBrands) {
        this.monitorBrands = monitorBrands;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
    public void printInfo(){
        System.out.println("Monitor Brand ="+monitorBrands+"Screen Size = "+size +"Monitor Brightness in NITS =" +brightness);
    }
}
