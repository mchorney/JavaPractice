package hw13;

public class App {
    public static void main(String[] args) {

        Monitor myscreen = new Monitor(MonitorBrands.LG, 32, 500);

        Keybord mykeys = new Keybord("HP", "LS250", KeyboardType.WIRELESS);

        Mouse mymouse = new Mouse("Apple", "Y50", MouseType.WIRELESS);

        SystemBlock myblock = new SystemBlock(Processor.INTELCOREI5, Motherboard.GIGABATE, "Zian569", SSD.INTERNAL);


        Computer mycomputer = new Computer(myscreen, mykeys, mymouse, myblock);

        mycomputer.printInfo();

    }
}