package homework13;

public class App {
    public static void main(String[] args) {
        Monitor Dell=new Monitor("Dell","24'","1920*1080");
        Keyboard KeyboardPrime= new Keyboard("wired", "Das Keyboard  Prime", "black");
        Mouse Asus=new Mouse("wired", "Asus", "black");
        Processor intell =new Processor("Intell", "i7");
        Motherboard mom=new Motherboard("1600mhz", "305*330");
        SystemBlock sb=new SystemBlock(intell, mom, "black");

    }
}
