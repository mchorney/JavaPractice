package homework13;


public class SystemBlock {

    private Processor processor;
    private Motherboard motherboard;
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public SystemBlock(Processor processor, Motherboard motherboard, Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.processor = processor;
        this.motherboard = motherboard;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
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

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
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


    public String printInfo() {
        return "SystemBlock{" +
                processor.PrintInfo() +
                motherboard.printInfo() +
                keyboard.printInfo() +
                mouse.ptintInfo() +
                monitor.printInfo() +
                '}';
    }
}
