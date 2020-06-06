package hw13;

public class App {

    public static void main(String[] args) {

        Monitor monitor = new Monitor("Samsung","SM21",21);

//        monitor.printOut();
//        System.out.println(monitor.getBrand());

        Keyboard keyboard = new Keyboard("TypeX","TN12","wireless");

//        keyboard.printOut();

        Mouse mouse = new Mouse(MouseBrand.LOGITECH,"MS1","wireless");

//        mouse.printOut();

        Processor processor = new Processor(ProcessorName.INTEL, "I7", 3.0);

//        processor.printOut();
//        System.out.println(processor.getBrand());

        RAM ram = new RAM(RAMbrand.CORSAIR,"RAM1",16);

//        ram.printOut();


        SystemBlock dellX = new SystemBlock("DellX",processor,Motherboard.BIOSTAR,GPU.BRAIN,ram);
//        dellX.printOut();

        Computer dell = new Computer(dellX, keyboard, mouse, monitor);

        dell.printInfo();







    }
}

