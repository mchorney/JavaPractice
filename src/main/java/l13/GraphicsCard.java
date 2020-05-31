package l13;

public class GraphicsCard {
    private Brand brand;
    private MemoryType memoryType;
    private MemoryCapacity memoryCapacity;

    public GraphicsCard(Brand brand, MemoryType memoryType, MemoryCapacity memoryCapacity) {
        this.brand = brand;
        this.memoryType = memoryType;
        this.memoryCapacity = memoryCapacity;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public MemoryType getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(MemoryType memoryType) {
        this.memoryType = memoryType;
    }

    public MemoryCapacity getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(MemoryCapacity memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public String printInfo() {
        return "GC brand: " + getBrand() + ". GC capacity: " + getMemoryCapacity() + ". GC type: " + getMemoryType() + ".";
    }
}
