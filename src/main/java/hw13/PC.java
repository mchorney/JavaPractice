package hw13;

public class PC {
    private Brand brand;
    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;
    private SystemBlock systemBlock;

    public PC(Brand brand, Keyboard keyboard, Monitor monitor, Mouse mouse, SystemBlock systemBlock) {
        this.brand = brand;
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.mouse = mouse;
        this.systemBlock = systemBlock;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
    }

    public void printInfo(){
        System.out.println("PC Brand = " + brand + "\n" + "Keyboard " + keyboard.toPrintKeyboard() + "\n"
                + "Monitor " + monitor.toPrintMonitor() + "\n" + "Mouse " + mouse.toPrintMouse() + "\n" + "System Block " + systemBlock.toPrintSystemBlock());
    }
}
