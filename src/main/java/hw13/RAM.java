package hw13;

public class RAM {
    private RAMbrand  brand;
    private String  model;
    private int memorySize;

    public RAM(RAMbrand brand, String model, int memorySize) {
        this.brand = brand;
        this.model = model;
        this.memorySize = memorySize;
    }

    public RAMbrand getBrand() {
        return brand;
    }

    public void setBrand(RAMbrand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public String printOut() {
        return (" RAM " +brand+ " model " +model+ ", memory size " +memorySize+ " GB. ");
    }
}
