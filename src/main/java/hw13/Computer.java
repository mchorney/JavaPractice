package hw13;

public class Computer {
    private Keyboard keyboard;
    private Monitor monitor;
    //private Motherboard motherboard;
    private Mouse mouse;
    private SystemBlock systemBlock;

    public Computer(Keyboard keyboard, Monitor monitor, Motherboard motherboard, Mouse mouse, SystemBlock systemBlock) {
        this.keyboard = keyboard;
        this.monitor = monitor;
        //this.motherboard = motherboard;
        this.mouse = mouse;
        this.systemBlock = systemBlock;
    }
    public String printInfo(){
        return "Systemblock :(" + systemBlock.printInfo() + "); Monitor " + monitor.printInfo() +"; Mouse " + mouse.printInfo() + "; Keyboard " + keyboard.printInfo() ;
    }

    public void printInfo2(){
        System.out.println(this.printInfo());
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

}
