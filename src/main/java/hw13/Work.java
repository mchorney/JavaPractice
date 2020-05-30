package hw13;

public class Work {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse ("Logitech", "m1", MouseType.WIRELESS);
        Mouse mouse2 = new Mouse ("Logitech", "m2", MouseType.WIRED);
        Monitor monitor1 = new Monitor("Dell", "m1332", MonitorType.INCH_13);
        Monitor monitor2 = new Monitor("Dell", "m1732", MonitorType.INCH_17);
        Keyboard keyboard1 = new Keyboard(Brand.LOGITECH, "m2121", KeyboardType.GAME);
        Keyboard keyboard2 = new Keyboard(Brand.LG, "m3310", KeyboardType.WORK);
        Motherboard motherboard1 = new Motherboard(Brand.INTEL,Price.$1500, MotherboardType.ASUS_Z490);
        Processor processor1 = new Processor(Brand.INTEL, ProcessorType.i7);
        SystemBlock systemBlock1 = new SystemBlock(Brand.DELL, SystemBlockType.OFFICE, processor1, motherboard1);
        Computer computer1 = new Computer(keyboard1,monitor1,motherboard1,mouse2,systemBlock1);
        System.out.println(computer1.printInfo());
        System.out.println(computer1.getSystemBlock().getProcessor().getModel());
        System.out.println(computer1.getSystemBlock().getMotherboard().getPrice());
        //second way to print info:
        computer1.printInfo2();
    }
}
