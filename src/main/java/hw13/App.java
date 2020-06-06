package hw13;

public class App {

    public static void main(String[] args) {

        Monitor monitor = new Monitor("Samsung","SM21",21);

        Keyboard keyboard = new Keyboard("TypeX","TN12","wireless");

        Mouse mouse = new Mouse(MouseBrand.LOGITECH,"MS1","wireless");

        Motherboard motherboard = new Motherboard(MotherboardBrand.BIOSTAR,"MB7");

        Processor processor = new Processor(ProcessorName.INTEL, "I7", 3.0);

        RAM ram = new RAM(RAMbrand.CORSAIR,"RAM1",16);

        SystemBlock dellX = new SystemBlock("DellX",processor,motherboard,GPU.BRAIN,ram);

        Computer dell = new Computer(dellX, keyboard, mouse, monitor);

        dell.printInfo();







    }
}

