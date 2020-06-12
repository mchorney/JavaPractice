package homework_13;

public class SystemBlock {
    private String name;
    private Processor processor;
    private Motherboard motherboard;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public SystemBlock(String name, Processor processor, Motherboard motherboard, double price) {
        this.name = name;
        this.processor = processor;
        this.motherboard = motherboard;
        this.price = price;
    }

    public void printInfo(){
        System.out.println("System block: " +name+ "\nPrice: " +price);
        processor.printInfo();
        motherboard.printInfo();
    }
}
