package hw13;

public class App {

    public static void main(String[] args) {

        Monitor monitor = new Monitor("Samsung","SM21",21);

        Keyboard keyboard = new Keyboard("TypeX","TN12","wireless");

        Motherboard motherboard = new Motherboard("SpaceX","MB7","RAM1");

        Mouse mouse = new Mouse("MouseX","MS1","wireless");

        Processor processor = new Processor("INTEL", "I7", 3.0);

        RAM ram = new RAM("RamX","RAM1",16);

        SystemBlock DellX = new SystemBlock("DellX", "I7","MB7","GPU12");
        DellX.printOut();

        Computer dell = new Computer("Dell","Dell13","TypeX","MouseX","Samsung");
        dell.printOut();



    }
}
//    Заполните содержимым классы Monitor, Keyboard, Mouse, SystemBlock
//    Создайте как минимум 2 новых классса Processor, Motherboard fields in SystemBlock
//
//        в каждый класс поместите метод printInfo()
//
//        dell.prinInfo() - will print info about EVERYTHING
//
//
//        Содайте 2 новых класса и сделайте их полями в 3м
