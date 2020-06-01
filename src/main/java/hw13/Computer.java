package hw13;

public class Computer {
    private SystemBlock systemblock;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;

    public SystemBlock getSystemblock() {
        return systemblock;
    }

    public void setSystemblock(SystemBlock systemblock) {
        this.systemblock = systemblock;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
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

    public Computer(SystemBlock systemblock, Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this.systemblock = systemblock;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }



    public void printInfo(){
        System.out.println("_________________");
        systemblock.printInfo();
        monitor.printInfo();
        keyboard.printInfo();
        mouse.printInfo();

    }
}

