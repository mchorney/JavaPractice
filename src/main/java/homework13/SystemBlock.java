package homework13;

public class SystemBlock {
    private Processor processors;
    private Motherboard motherboards;
    private String color;

    public SystemBlock(Processor processors, Motherboard motherboards, String color) {
        this.processors = processors;
        this.motherboards = motherboards;
        this.color = color;
    }

    public Processor getProcessors() {
        return processors;
    }

    public Motherboard getMotherboards() {
        return motherboards;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "SystemBlock{" +
                "processors=" + processors +
                ", motherboards=" + motherboards +
                ", color='" + color + '\'' +
                '}';
    }
}

