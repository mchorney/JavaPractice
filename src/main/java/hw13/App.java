package hw13;

/*
Заполните содержимым классы Monitor, Keyboard, Mouse, SystemBlock
Создайте как минимум 2 новых классса Processor, Motherboard fields in SystemBlock
в каждый класс поместите метод printInfo()
dell.prinInfo() - will print info about EVERYTHING
Содайте 2 новых класса и сделайте их полями в 3м
 */

public class App {

    public static void main(String[] args) {
        
        Processor i7 = new Processor("Intel", "Core i7", 1000);
        Motherboard rogStrix = new Motherboard("Asus", "Rog Strix B450", 150);
        SystemBlock powerEdge = new SystemBlock("Dell", i7, rogStrix, 500);
        Keyboard cynosa = new Keyboard("Razor", "Cynosa Chroma", 50);
        Monitor thinkVision = new Monitor("Lenovo", "24E", 130);
        Mouse basilisk = new Mouse(MouseBrand.RAZER, "Basilisk X", MouseType.WIRELESS);

        Computer dell = new Computer(powerEdge, cynosa, basilisk, thinkVision);
        dell.printInfo();
    }

}
