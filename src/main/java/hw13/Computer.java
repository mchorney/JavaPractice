package hw13;

public class Computer {
    private SystemBlock systemBlock;
    private Monitor monitor;
    private Mouse mouse;
    private Keyboard keyboard;

    public Computer(SystemBlock systemBlock, Monitor monitor, Mouse mouse, Keyboard keyboard) {
        this.systemBlock = systemBlock;
        this.monitor = monitor;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }
    public void printInfo(){
        systemBlock.printInfo();
        monitor.printInfo();
        mouse.printInfo();
        keyboard.printInfo();
    }

}
