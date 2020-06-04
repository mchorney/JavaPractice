package hw13;

public class Computer {
    private String name;
    private SystemBlock  systemBlock;
    private Keyboard  keyboard;
    private Mouse  mouse;
    private Monitor  monitor;


    public Computer(String  name, SystemBlock systemBlock, Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.name = name;
        this.systemBlock = systemBlock;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void printOut() {
        System.out.println("My new PC is "+name+ " and consist of: System Block " +systemBlock+ ", Monitor " +monitor+", Keyboard " +keyboard+" and mouse " +mouse+".");
    }
}






