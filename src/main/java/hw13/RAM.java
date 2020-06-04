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



    public void printOut() {
        System.out.println("RAM " +brand+ "model, " +model+ "memory size " +memorySize+ " GB, ");
    }
}
