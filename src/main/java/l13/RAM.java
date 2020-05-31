package l13;

public class RAM {
    private Brand brand;
    private MemoryCapacity memoryCapacity;
    private MemoryType ramMemoryType;

    public RAM(Brand brand, MemoryCapacity memoryCapacity, MemoryType ramMemoryType) {
        this.brand = brand;
        this.memoryCapacity = memoryCapacity;
        this.ramMemoryType = ramMemoryType;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public MemoryCapacity getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(MemoryCapacity memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public MemoryType getRamMemoryType() {
        return ramMemoryType;
    }

    public void setRamMemoryType(MemoryType ramMemoryType) {
        this.ramMemoryType = ramMemoryType;
    }

    public String printInfo() {
        return "RAM brand: " + getBrand() + ". RAM capacity: " + getMemoryCapacity() + ". RAM type: " + getRamMemoryType() + ".";
    }

}
