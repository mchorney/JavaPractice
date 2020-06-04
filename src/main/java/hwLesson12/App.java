package hwLesson12;

public class App {
    public static void main(String[]args){
        //MOUSE
        Mouse mouse = new Mouse("Microsoft","x-series",MouseType.WIRELESS);
        //MONITOR
        Monitor monitor = new Monitor("Dell","24inch", MonitorType.CURVE);
        //System.out.println(mouse);
        mouse.printOut();
//        monitor.printOut();
        //CPU
        Cpu cpu = new Cpu(CpuBrand.AMD,CpuModel.AMD_A_10_4600M);
//        cpu.printOut();
        //KEYBOARD
        Keyboard keyboard = new Keyboard("Microsoft","X-Series",KeyboardType.WIRELESS);
//        keyboard.printOut();
        //MOTHER BOARD
        MotherBoard motherBoard = new MotherBoard("Intel","9th Gen Intel® Core™ i5 9400 ",4);
//        motherBoard.printOut();
        //SYSTEM BLOCK
        SystemBlock systemblock = new SystemBlock(motherBoard,cpu);
//      String mySystemBlock = systemblock.printOut();
        Computer dell = new Computer(systemblock,keyboard,mouse,monitor);
        dell.printInfo();

    }
}
