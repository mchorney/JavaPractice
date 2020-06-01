package hw13;

public class App {
    public static void main(String[] args) {
        Mouse mouse = new Mouse("Logi", DeviceColor.PINK, MouseType.WIRELESS);
        SystemBlock systema= new SystemBlock(new Processor(ProcessorBrand.INTEL,3.0, 512),new Motherboard
                (BrandMotherboard.GIGABYTE,115));
        Keyboard keyboard= new Keyboard(KeyboardBrand.CORSAIR,DeviceColor.BLACK,2018);
        Monitor monitor= new Monitor("Hitachi",2017,MonitorType.DLP,DeviceColor.SILVER);

        Computer dell= new Computer(systema,monitor,mouse,keyboard);

        dell.printInfo();


    }
}
