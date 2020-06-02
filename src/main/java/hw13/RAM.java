package hw13;

public class RAM {
    private String  brand;
    private String  model;
    private int memorySize;

    public RAM(String brand, String model, int memorySize) {
        this.brand = brand;
        this.model = model;
        this.memorySize = memorySize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
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

    public void printOut() {
        System.out.println("RAM " +brand+ "model, " +model+ "memory size " +memorySize+ " GB, ");
    }
}
