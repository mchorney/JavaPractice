package hwk13;

public class App {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard(KeyboardType.WIRELESS);
        Mouse mouse = new Mouse(MouseType.WIRELESS, Brand.VIEWSONIC);
        Monitor monitor = new Monitor(MonitorType.LED, Brand.LG, MonitorSize.D);
        Processor cpu = new Processor(CPUManufacturer.INTEL, 800, 2);
        Motherboard motherboard = new Motherboard(64, cpu, "AMD X470", "ATX", "ASUS TUF Z390-Plus");
        SystemBlock sysblock = new SystemBlock(cpu, motherboard);

        Computer myComp = new Computer(keyboard, mouse, monitor, sysblock);
        myComp.printInfo();

    }
}
