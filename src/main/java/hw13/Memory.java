package hw13;

public class Memory {
    private String memory;
    private MemoryCap capacity;

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public MemoryCap getCapacity() {
        return capacity;
    }

    public void setCapacity(MemoryCap capacity) {
        this.capacity = capacity;
    }

    public Memory(String memory, MemoryCap capacity) {
        this.memory = memory;
        this.capacity = capacity;
    }

    public void printInfo() {
        System.out.println("Memory" + memory + " Memory Capacity = " + capacity);
    }
}
