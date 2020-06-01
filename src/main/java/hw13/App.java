package hw13;

public class App {
    public static void main(String[] args) {
        Mouse logi = new Mouse("Logi", DeviceColor.PINK, MouseType.WIRELESS);
        Processor cpu = new Processor(ProcessorBrand.INTEL, 3.0, 512);
        Motherboard mother = new Motherboard(BrandMotherboard.GIGABYTE, 515.99);

        SystemBlock del = new SystemBlock(new Monitor("Aser", 2019, MonitorType.LED, DeviceColor.BLACK),
                logi, cpu, mother, new Keyboard(KeyboardBrand.REDRAGON, DeviceColor.GREY,2005));
        del.printInfo();


    }
}
