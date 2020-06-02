package hw13;

public class App {
    public static void main(String[] args) {

        Monitor myscreen = new Monitor(MonitorBrands.SAMSUNG, MonitorType.FOURK, Price.$300);

        Keybord mykeys = new Keybord(Brands.LENOVO, Price.$50, KeyboardType.WIRELESS);

        Mouse mymouse = new Mouse(Brands.RAZOR, Price.$150, MouseType.WIRELESS);

        SystemBlock myblock = new SystemBlock(ProcessorBrands.INTEL, MotherboardBrands.ASROCK, "150 watt", SSDamount.GB256);


        Computer mycomputer = new Computer(myscreen, mykeys, mymouse, myblock);

        mycomputer.printInfo();

    }
}