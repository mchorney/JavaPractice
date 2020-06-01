package homework_13;
//Заполните содержимым классы Monitor, Keyboard, Mouse, SystemBlock
//Создайте как минимум 2 новых классса Processor, Motherboard fields in SystemBlock
//в каждый класс поместите метод printInfo()
//dell.prinInfo() - will print info about EVERYTHING
//Содайте 2 новых класса и сделайте их полями в 3м
public class Homework_13 {
    public static void main(String[] args) {
        Mouse logitech = new Mouse("Logitech", Type.WIRELESS);
        Monitor lg = new Monitor("LG", "24BK430H-B", 24);
        Keyboard hp = new Keyboard("HP", Type.WIRED);
        Processor processor = new Processor("i7-8700K","3.7 GHz");
        Motherboard motherboard = new Motherboard("MSI Z370-A Pro");
        SystemBlock sb = new SystemBlock("Dell", processor,motherboard, 1234);

        Computer dell = new Computer(sb,lg,hp,logitech);
        dell.printInfo();
    }
}
