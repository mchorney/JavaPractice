package hw13;

public class Computer {
    private String name;
    private String  systemBlock;
    private String  keyboard;
    private String  mouse;
    private String  monitor;

    public Computer(String name, String systemBlock, String keyboard, String mouse, String monitor) {
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

    public String getSystemBlock() {
        return systemBlock;
    }

    public void setSystemBlock(String systemBlock) {
        this.systemBlock = systemBlock;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public void printOut() {
        System.out.println("My new PC is "+name+ " and consist of: System Block " +systemBlock+ ", Monitor " +monitor+", Keyboard " +keyboard+" and mouse " +mouse+".");
    }
}






