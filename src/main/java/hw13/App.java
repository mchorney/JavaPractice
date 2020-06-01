package hw13;

import javax.print.attribute.standard.PrinterInfo;

public class App {
    public static void main(String[] args) {
        Processor ProcessorforDell = new Processor (6, ProcessorManufactor.AMD);
        Memory Dellmemory = new Memory ("4 Gb", MemoryCap.SMALL);
        MotherBoard DellMotherB = new MotherBoard (MotherBtypes.AT,Brands.GIGABYTE );
        SystemBlock DellSystemBlock = new SystemBlock (ProcessorforDell,Dellmemory, DellMotherB);
        Monitor MonitorforDell = new Monitor (24, MonitorType.LED, Brands.DELL);
        Mouse MouseforDell = new Mouse (Brands.PHILLIPS,colors.GREY,wireType.WIRED);
        Keyboard KeyboardforDell = new Keyboard(Brands.ASUS, lights.RED,wireType.WIRELESS);

        Computer Dell = new Computer(DellSystemBlock,MonitorforDell, KeyboardforDell, MouseforDell);

        Dell.printInfo();







    }


}
