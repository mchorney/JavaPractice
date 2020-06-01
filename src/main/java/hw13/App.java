package hw13;

import javax.crypto.Mac;

public class App {
    public static void main(String[] args) {
        GraphicCard NVIDIA = new GraphicCard(Brand.Mac,"AGH 1300");
        Keyboard ASUS = new Keyboard(Brand.ASUs,"L100",Type.Mechanical);
        Monitor MonAsus = new Monitor(Brand.ASUs,14.5, 20.5,MonitorType.LCD);
        Mouse Logitech = new Mouse("Logitech","902GN",Type.Wireless);
        Processor Intel = new Processor(Brand.Lenovo,"i7");
        MotherBoard mb = new MotherBoard("ATX",Brand.ASUs);
        SystemBlock sb = new SystemBlock(Intel,mb);
        Computer MyComp = new Computer(Brand.ASUs,sb,ASUS,Logitech,MonAsus,OperationSystem.Windows, NVIDIA);
        MyComp.printOut();
    }
}
