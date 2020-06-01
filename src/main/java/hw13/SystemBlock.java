package hw13;

public class SystemBlock {
    private Processor processor;
    private MotherBoard motherboard;

    public SystemBlock(Processor processor, MotherBoard motherboard) {
        this.processor = processor;
        this.motherboard = motherboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public MotherBoard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(MotherBoard motherboard) {
        this.motherboard = motherboard;
    }
    public String printInfo(){
        return "System Block { "+ processor.printInfo()+";"+motherboard.printInfo()+'}';
    }
}
