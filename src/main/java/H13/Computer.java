package H13;

public class Computer {
    private SystemBlock systemBlock;
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer(SystemBlock systemBlock, Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.systemBlock = systemBlock;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
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

    public void printInfo() {
        System.out.println("Information about the computer.");
        keyboard.printInfo();
        monitor.printInfo();
        mouse.printInfo();
        systemBlock.printInfo();
    }
}
