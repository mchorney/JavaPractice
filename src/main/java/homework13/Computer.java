package homework13;

public class Computer {
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private SystemBlock systemBlock;

    public Computer(Monitor monitor, Keyboard keyboard, Mouse mouse, SystemBlock systemBlock) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.systemBlock = systemBlock;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

   public void printInfo(){
        keyboard.printInfo();
   }

}
