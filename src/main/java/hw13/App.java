package hw13;

public class App {
    public static void main(String[] args) {

        Monitor myscreen = new Monitor(MonitorBrands.SAMSUNG, MonitorType.FOURK, Price.$300);

        Keybord mykeys = new Keybord(Brands.LENOVO, Price.$50, KeyboardType.WIRELESS);

        Mouse mymouse = new Mouse(Brands.RAZOR, Price.$150, MouseType.WIRELESS);

        SystemBlock myblock = new SystemBlock("INTEL", "MSI", "150 watt", 128);


        Computer mycomputer = new Computer(myscreen, mykeys, mymouse, myblock);

        mycomputer.printInfo();

    }
}