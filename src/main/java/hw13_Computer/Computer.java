package hw13_Computer;

public class Computer {
    private NameOfBrand name;
    private String model;
    private SystemBlock sysBlock;
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;
    private OperatingSystem os;

    public Computer(NameOfBrand name,String model, SystemBlock sysBlock, Keyboard keyboard, Mouse mouse, Monitor monitor, OperatingSystem os) {
        this.name = name;
        this.sysBlock = sysBlock;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
        this.os = os;
        this.model=model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public SystemBlock getSysBlock() {
        return sysBlock;
    }

    public void setSysBlock(SystemBlock sysBlock) {
        this.sysBlock = sysBlock;
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

    public OperatingSystem getOs() {
        return os;
    }

    public void setOs(OperatingSystem os) {
        this.os = os;
    }

    public NameOfBrand getName() {
        return name;
    }

    public void setName(NameOfBrand name) {
        this.name = name;
    }

    public String returnInfo(){
        return "\nSystem Block: \n"+sysBlock.printInfo()+"\nKeyboard: \n"+keyboard.printInfo()+"\nMouse: \n"+mouse.printInfo()+
                "\nMonitor: \n"+monitor.printInfo();
    }

    public void printInfo(){
        System.out.println("Brand = "+name+"\nModel = "+model+"\n"+returnInfo()+"\nOperating System: "+os);

    }
}
