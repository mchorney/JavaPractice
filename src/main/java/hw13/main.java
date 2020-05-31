package hw13;

public class main {
    public static void main(String[] args) {
        GraphicCard NVIDIA = new GraphicCard(Brand.NVIDIA,"AGH 1300");
        Keyboards ASUS = new Keyboards(Brand.ASUS,"L100",Type.MECHANICAL);
        Monitor MonAsus = new Monitor(Brand.ASUS,14.5, 20.5,MonitorType.LCD);
        Mouse Logitech = new Mouse("Logitech","902GN",Type.WIRELESS);
        Processor Intel = new Processor(Brand.INTEL,"i7");
        Motherboard mb = new Motherboard("ATX",Brand.ASUS);
        SystemBlock sb = new SystemBlock(Intel,mb);
        Computers MyComp = new Computers(Brand.ASUS,sb,ASUS,Logitech,MonAsus,OperationSystem.WINDOWS,NVIDIA);
        MyComp.printOut();
    }
}
