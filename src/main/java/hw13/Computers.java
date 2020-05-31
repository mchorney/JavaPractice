package hw13;

public class Computers {
    private Brand brand;
    private SystemBlock systemBlock;
    private Keyboards keyboard;
    private Mouse mouse;
    private Monitor monitor;
    private OperationSystem os;
    private GraphicCard card;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
    }

    public Keyboards getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboards keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public OperationSystem getOs() {
        return os;
    }

    public void setOs(OperationSystem os) {
        this.os = os;
    }

    public GraphicCard getCard() {
        return card;
    }

    public void setCard(GraphicCard card) {
        this.card = card;
    }

    public Computers(Brand brand, SystemBlock systemBlock, Keyboards keyboard, Mouse mouse, Monitor monitor, OperationSystem os, GraphicCard card) {
        this.brand = brand;
        this.systemBlock = systemBlock;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
        this.os = os;
        this.card = card;
    }

    public void printOut() {
        String computer = "Characteristics{ \n" +
                "Brand = " + brand + '\n' + systemBlock.printInfo() + '\n' +
                keyboard.printInfo() + '\n' +
                mouse.printInfo() + '\n' +
                monitor.printInfo() + '\n' +
                "Operation System = " + os + '\n' +
                card.printInfo();
        System.out.println(computer);
    }

}
