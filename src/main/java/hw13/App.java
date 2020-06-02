package hw13;

public class App {
    public static void main(String[] args) {
        Keyboard kb01 = new Keyboard(Brand.HP, "KB01", 56);
        Monitor m01 = new Monitor("LCD", "M001", Brand.LOGITECH);
        Mouse ms01 = new Mouse(Brand.LOGITECH, "MUS01", 3);
        Motherboard mbrd01 = new Motherboard(Brand.DELL, 6, 2020, true);
        Processor prcr01 = new Processor(Brand.INTEL, 75.8, 3, 2018);
        SystemBlock sb01 = new SystemBlock(Brand.APPLE, prcr01, mbrd01);
        PC comp = new PC(Brand.APPLE, kb01, m01, ms01, sb01);

        comp.printInfo();
    }
}
