package hwk13;

public class Motherboard {
    private int ram;
    private Processor cpu;
    private String chipset;
    private String formFactor;
    private String name;

    public Motherboard(int ram, Processor processor, String chipset, String formFactor, String name) {
        this.ram = ram;
        cpu = processor;
        this.chipset = chipset;
        this.formFactor = formFactor;
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public Processor getCpu() {
        return cpu;
    }

    public String getChipset() {
        return chipset;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Motherboard{" +
                "ram=" + ram +
                ", chipset='" + chipset + '\'' +
                ", formFactor='" + formFactor + '\'' +
                ", name='" + name + '\'' +
                '}');
        cpu.printIfo();
    }
}
