package hwk13;

public class SystemBlock {
    private Processor processor;
    private Motherboard motherboard;

    public SystemBlock(Processor processor, Motherboard motherboard) {
        this.processor = processor;
        this.motherboard = motherboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }


    public void printInfo() {
        motherboard.printInfo();
    }
}
