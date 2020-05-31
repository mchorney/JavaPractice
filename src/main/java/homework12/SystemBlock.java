package homework12;

public class SystemBlock {
    private Motherboard Motherboard;
    private Processor Processor;
    private String ram;
    private double HDD;

    public SystemBlock(homework12.Motherboard motherboard, homework12.Processor processor, String ram, double HDD) {
        Motherboard = motherboard;
        Processor = processor;
        this.ram = ram;
        this.HDD = HDD;
    }

    public homework12.Motherboard getMotherboard() {
        return Motherboard;
    }

    public void setMotherboard(homework12.Motherboard motherboard) {
        Motherboard = motherboard;
    }

    public homework12.Processor getProcessor() {
        return Processor;
    }

    public void setProcessor(homework12.Processor processor) {
        Processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public double getHDD() {
        return HDD;
    }

    public void setHDD(double HDD) {
        this.HDD = HDD;
    }


    public void printInfo() {
//        System.out.println("SystemBlock{" +
//                "Motherboard=" + Motherboard +
//                ", Processor=" + Processor +
//                ", ram='" + ram + '\'' +
//                ", HDD=" + HDD +
//                '}');
        Motherboard.printInfo();
        Processor.printInfo();
        System.out.println(ram);
        System.out.println(HDD);

    }

}
