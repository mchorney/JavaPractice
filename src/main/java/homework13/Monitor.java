package homework13;

public class Monitor {
    private Brand monitorBrand;
    private Color color;
    private String size;
    private String resolution;

    public Monitor(Brand monitorBrand, Color color, String size, String resolution) {
        this.monitorBrand = monitorBrand;
        this.color = color;
        this.size = size;
        this.resolution = resolution;
    }

    public Brand getMonitorBrand() {
        return monitorBrand;
    }

    public void setMonitorBrand(Brand monitorBrand) {
        this.monitorBrand = monitorBrand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String printInfo() {
        return "Monitor{" +
                "monitorBrand=" + monitorBrand +
                ", color=" + color +
                ", size='" + size + '\'' +
                ", resolution='" + resolution + '\'' +
                '}';
    }
}
