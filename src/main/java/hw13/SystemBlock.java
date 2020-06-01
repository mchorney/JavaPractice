package hw13;

public class SystemBlock {
    private Monitor monitor;
    private Mouse mouse;
    private Processor processor;
    private Motherboard motherboard;
    private Keyboard keyboard;

    public SystemBlock(Monitor monitor, Mouse mouse, Processor processor, Motherboard motherboard, Keyboard keyboard) {
        this.monitor = monitor;
        this.mouse = mouse;
        this.processor = processor;
        this.motherboard = motherboard;
        this.keyboard= keyboard;
    }
    public void printInfo(){
        monitor.printInfo();
        mouse.printInfo();
        processor.printInfo();
        motherboard.printInfo();
        keyboard.printInfo();
    }
}
