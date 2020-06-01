package homework13;

public class App {

    public static void main(String[] args) {

        Processor processor = new Processor(Brand.INTEL, 8, 3.0);
        System.out.println(processor.PrintInfo());
        Motherboard motherboard = new Motherboard(Brand.AMD, "12 × 9.6 in");
        Mouse mouse = new Mouse(Brand.LOGITECH, Color.BLACK, CordPresence.CORDLESS, 2);
        Keyboard keyboard = new Keyboard(Brand.Razer, Color.BLACK, CordPresence.WITHCORD, "linear");
        Monitor monitor = new Monitor(Brand.DELL, Color.BLACK, "34 inch", "1920 x 1080");
        SystemBlock new_computer = new SystemBlock(processor, motherboard, keyboard, mouse, monitor);

        System.out.println(new_computer.printInfo());

    }
}
