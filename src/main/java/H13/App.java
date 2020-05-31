package H13;

public class App {
    public static void main(String[] args) {
        Processor ryzen5 = new Processor("AMD", "Ryzen 5 2600 OEM", 8390);
        Motherboard b450m = new Motherboard("Gigabyte", "B450M DS3H", 5190);
        SystemBlock iruHome = new SystemBlock("Dell", ryzen5, b450m, 13580);
        Keyboard multiDevice = new Keyboard("LOGITECH", "WIRELESS", 3580);
        Monitor vision = new Monitor("BENQ", "EX3501R", 35, 55950);
        Mouse trackBall = new Mouse("LOGITECH", "WIRELESS", 7690);

        Computer dell = new Computer(iruHome, multiDevice, trackBall, vision);
        dell.printInfo();
    }
}
