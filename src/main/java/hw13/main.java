package hw13;

public class main {
    public static void main(String[] args) {
        GraphicCard NVIDIA = new GraphicCard(Brand.NVIDIA,"AGH 1300");
        Keyboards ASUS = new Keyboards(Brand.ASUS,"L100",Type.MECHANICAL);
        Monitor MonAsus = new Monitor(Brand.ASUS,14.5, 20.5,MonitorType.LCD);
        Mouse Logitech = new Mouse("Logitech","902GN",Type.WIRELESS);
        SystemBlock Intel = new SystemBlock(Processor.Intel,Motherboard.ATX);
        Computers MyComp = new Computers(Brand.ASUS,Intel,ASUS,Logitech,MonAsus,OperationSystem.WINDOWS,NVIDIA);
        MyComp.printOut();
    }
}
