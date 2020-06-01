package homework13;


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

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public String printInfo() {
        return "SystemBlock{" +
                processor.PrintInfo() +
                motherboard.printInfo() +
                '}';
    }
}
