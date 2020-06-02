package hw13;

public class App {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse ("Logitech", "m12", MouseType.WIRELESS);
        Monitor monitor1 = new Monitor("Dell", "m13", MonitorType.FULL_HD);
        Keyboard keyboard1 = new Keyboard(Brand.LOGITECH, "m14", KeyboardType.WIRED);
        Motherboard motherboard1 = new Motherboard(Brand.INTEL, MotherboardType.SOCKET1156);
        Processor processor1 = new Processor(Brand.INTEL, ProcessorType.i5);
        SystemBlock systemBlock1 = new SystemBlock(Brand.DELL, SystemBlockType.ATX, processor1, motherboard1);
        Computer dell = new Computer(keyboard1, monitor1,motherboard1,mouse1,systemBlock1);
        System.out.println(dell.printInfo());

    }
}
