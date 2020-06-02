package hw13;

public class SystemBlock {
    private ProcessorBrands processor;
    private MotherboardBrands motherboard;
    private String cooler;
    private SSDamount ssd;


    public SystemBlock(ProcessorBrands processor, MotherboardBrands motherboard, String cooler, SSDamount ssd) {
        this.processor = processor;
        this.motherboard = motherboard;
        this.cooler = cooler;
        this.ssd = ssd;
    }

    public void printInfo() {
        System.out.println("Processor = " + processor + ", Motherboard = " + motherboard + ", Cooler = " + cooler + ", SSD =" + ssd);
    }
}
