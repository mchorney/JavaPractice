package hw13;

public class App {
    public static void main(String[] args) {

        Monitor myscreen = new Monitor(MonitorBrands.SAMSUNG, MonitorType.FOURK, Price.$300);

        Keybord mykeys = new Keybord(Brands.LENOVO, Price.$50, KeyboardType.WIRELESS);

        Mouse mymouse = new Mouse(Brands.RAZOR, Price.$150, MouseType.WIRELESS);

        Processor myprocessor = new Processor(ProcessorBrands.INTEL, Price.$300);

        Motherboard mymotherboard = new Motherboard(MotherboardBrands.GIGABATE, Price.$150);

        SSD myssd = new SSD(SSDtype.INTERNAL,SSDamount.GB256,Price.$50);

        SystemBlock myblock = new SystemBlock(myprocessor,mymotherboard,myssd);

        Computer mycomputer = new Computer(myscreen, mykeys, mymouse, myblock);

        mycomputer.printOut();

    }
}