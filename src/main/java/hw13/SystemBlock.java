package hw13;

public class SystemBlock {
    private Processor processor;
    private Motherboard motherboard;
    private SSD ssd;


    public SystemBlock(Processor processor, Motherboard motherboard, SSD ssd) {
        this.processor = processor;
        this.motherboard = motherboard;
        this.ssd = ssd;
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

    public SSD getSsd() {
        return ssd;
    }

    public void setSsd(SSD ssd) {
        this.ssd = ssd;
    }

    public String printInfo(){
        return "System Block - "+ processor.printInfo() +"," + motherboard.printInfo() + "," + ssd.printInfo();
    }
}
