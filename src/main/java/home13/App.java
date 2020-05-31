package home13;

public class App {
    public static void main(String[] args) {
        Mouse mouse=new Mouse(MouseTape.LASER,"Genius",Color.BLACK);
        Keyboard keybord=new Keyboard("Razer",KeyboardTape.ERGONOMIC,Color.BLACK);
        Monitor monitor=new Monitor("Eizo",MonitorTape.LED,17);
        Motherboard motherboard=new Motherboard("MSI",MotherboardTape.MINIATX);
        Processor processor1=new Processor("Silicon Graphics",ProcessorTape.INTELCELERON);
        SystemBlock systemBlock=new SystemBlock(processor1,motherboard,SystemBlockTape.BIGTOWER,1000);
        Computer dell=new Computer(monitor,keybord,mouse,systemBlock);
        dell.printInfo1();

    }
}
