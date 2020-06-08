package hw1213;

public class SystemBlock {
    private Processor processor;
    private Motherboard motherboard;
    private String ssd;

    public SystemBlock(Processor processor, Motherboard motherboard, String ssd) {
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

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "SystemBlock{" +
            "processor=" + processor +
            ", motherboerd=" + motherboard +
            ", ssd=" + ssd +
            '}';
    }
}
