package hwk13;

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;
    private SystemBlock sysblock;

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor, SystemBlock sysblock) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
        this.sysblock = sysblock;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public SystemBlock getSysblock() {
        return sysblock;
    }

    public void printInfo() {
        System.out.println("Computer{" +
                "keyboard=" + keyboard +
                ", mouse=" + mouse +
                ", monitor=" + monitor +
                ", sysblock=" + sysblock +
                '}');
    }
}
