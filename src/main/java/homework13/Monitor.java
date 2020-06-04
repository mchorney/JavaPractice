package homework13;

public class Monitor {
    private String model;
    private String size;
    private String resolution;

    public Monitor(String model, String size, String resolution) {
        this.model = model;
        this.size = size;
        this.resolution = resolution;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public String getResolution() {
        return resolution;
    }

    public void printInfo() {
        System.out.println("Monitor model = " + model + ", size =" + size + ", resolution = " + resolution);
    }
}
