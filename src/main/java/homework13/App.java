package homework13;

import java.util.concurrent.Callable;

public class App {
    public static void main(String[] args) {
        Monitor dell=new Monitor("Dell","24'","1920*1080");
        Keyboard keyboardPrime= new Keyboard("wired", "Das Keyboard  Prime", "black");
        Mouse asus=new Mouse("wired", "Asus", "black");
        Processor intell =new Processor("Intell", "i7");
        Motherboard mom=new Motherboard("1600mhz", "305*330");
        SystemBlock sb=new SystemBlock(intell, mom, "black");
        Computer comp=new Computer(dell, keyboardPrime, asus,sb);

            comp.printInfo();
        }
}
