package hw13;

public class SystemBlock {
    private Processor processor;
    private Motherboard motherboard;
    private String cooler;
    private SSD ssd;


    public SystemBlock(Processor processor, Motherboard motherboard, String cooler, SSD ssd) {
        this.processor = processor;
        this.motherboard = motherboard;
        this.cooler = cooler;
        this.ssd = ssd;
    }

    public void printInfo() {
        System.out.println("Processor = " + processor + ", Motherboard = " + motherboard + ", Cooler = " + cooler + ", SSD =" + ssd);
    }
}
