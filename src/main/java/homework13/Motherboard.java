package homework13;

public class Motherboard {
    private String RAM;
    private String size;

    public Motherboard(String RAM, String size) {
        this.RAM = RAM;
        this.size = size;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getRAM() {
        return RAM;
    }

    public String getSize() {
        return size;
    }

    public void printInfo() {
        System.out.println("Motherboard RAM = " + RAM + ", size = " + size);
    }
}
