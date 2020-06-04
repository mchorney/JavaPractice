package hwLesson12;

public class MotherBoard {
    private String brand;
    private String type;
    private int memorySlots;

    public MotherBoard(String brand, String type, int memorySlots) {
        this.brand = brand;
        this.type = type;
        this.memorySlots = memorySlots;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getMemorySlots() {
        return memorySlots;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMemorySlots(int memorySlots) {
        this.memorySlots = memorySlots;
    }

    public String printOut() {
        return "MotherBoard{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", memorySlots=" + memorySlots +
                '}';
    }

}
