package hw13;

public class SystemBlock {
    private Processor processor;
    private Motherboard motherboard;


    public SystemBlock(Processor processor, Motherboard motherboard) {
        this.processor = processor;
        this.motherboard = motherboard;

    }

    public void printInfo() {
        processor.printInfo();
        motherboard.printInfo();

    }
}
