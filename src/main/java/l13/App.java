package l13;

public class App {
    public static void main(String[] args) {

        Monitor monitor = new Monitor(Brand.HP, MonitorSize.I_34, MonitorResolution.UHD, new ConnectionType[]{ConnectionType.USB_C, ConnectionType.HDMI, ConnectionType.DISPLAY_PORT});
        Keyboard keyboard = new Keyboard(Brand.CORSAIR, KeyboardSize.STANDARD, ConnectionType.USB3);
        Mouse mouse = new Mouse(Brand.LOGITECH, MouseType.VERTICAL, ConnectionType.USB2);
        l13.Processor processor = new l13.Processor(Brand.INTEL, new String[]{"Core i9-9900K", "8 Cores up to 5.0 GHz", "Turbo unlocked", "LGA1151 300 Series", "95W"});
        HD hd = new HD(Brand.SAMSUNG, HDSize.TB1, HDInterface.SATA3, HDType.SSD);
        RAM ram = new RAM(Brand.CORSAIR, MemoryCapacity.GB32, MemoryType.DDR4);
        GraphicsCard graphicsCard = new GraphicsCard(Brand.RAZER, MemoryType.DDR5, MemoryCapacity.GB32);
        MotherBoard motherBoard = new MotherBoard(Brand.ASUS, new String[]{"MSI MPG Z490", "Gaming Carbon WiFi Gaming Motherboard", "ATX, 10th Gen Intel Core, LGA 1200 Socket, DDR4, SLI/CF, Dual M.2 Slots, USB 3.2 Gen 2, Wi-Fi 6, DP/HDMI, Mystic Light RGB"});

        SystemBlock deskTop = new SystemBlock(monitor, hd, ram, graphicsCard, motherBoard, processor, mouse, keyboard);
        deskTop.printInfo();






    }
}
