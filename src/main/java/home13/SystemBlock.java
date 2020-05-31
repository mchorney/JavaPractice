package home13;

public class SystemBlock {
    private Processor processor;
    private Motherboard motherboard;
    private SystemBlockTape type;
    private int price;

    public SystemBlock() {
    }
    public SystemBlock(Processor processor,Motherboard motherboard,SystemBlockTape type,int price){
        this.processor=processor;
        this.motherboard=motherboard;
        this.type=type;
        this.price=price;
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

    public SystemBlockTape getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(SystemBlockTape type) {
        this.type = type;

    }
    public void printInfo(){
        System.out.println("System Block type is "+ type+"Price is "+price);
        processor.printInfo();
        motherboard.printInfo();
    }
}
