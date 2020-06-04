package hw13;

public class Computer {
    private Brands brands;
    private SystemBlock systemBlock;
    private Monitor monitor;
    private Keybord keybord;
    private Mouse mouse;



    public Computer(Monitor monitor, Keybord keybord, Mouse mouse, SystemBlock systemBlock) {
        this.monitor = monitor;
        this.keybord = keybord;
        this.mouse = mouse;
        this.systemBlock = systemBlock;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keybord getKeybord() {
        return keybord;
    }

    public void setKeybord(Keybord keybord) {
        this.keybord = keybord;
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
    public void printOut(){
        String computer = "Computer: \n" +
                systemBlock.printInfo() + '\n' +
                monitor.printInfo() + '\n' +
                keybord.printInfo() + '\n' +
                mouse.printInfo();
        System.out.println(computer);
    }

}
