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


    public void printInfo() {
        System.out.print("SystemBlock (");
        processors.printInfo();
        System.out.print(" ; ");
        motherboards.printInfo();
        System.out.println("; color=" + color+")");

    }
}


