package homework13;

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;
    private SystemBlock systemblock;

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor, SystemBlock systemblock) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
        this.systemblock = systemblock;

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

    public SystemBlock getSystemblock() {
        return systemblock;
    }

    public void setSystemblock(SystemBlock systemblock) {
        this.systemblock = systemblock;
    }


    public String printInfo() {
        return "Computer{" +
                keyboard.printInfo() +
                mouse.ptintInfo() +
                monitor.printInfo() +
                systemblock.printInfo() +
                '}';
    }
}
