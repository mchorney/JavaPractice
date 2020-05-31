package hw13_Computer;

public class Work {
    public static void main(String[] args) {
      Monitor macMonitor =new Monitor(NameOfBrand.APPLE,TypeOfMonitor.DIGITAL,"5120-by-2880","27-inch" );
      CPU macProcessor = new CPU(NameOfBrand.APPLE,TypeOfProcessor.I8,BitSupport.BIT_64);
      MotherBoard macMB = new MotherBoard(TypeOfMotherboard.APPLE_LOGIC_BOARD,NameOfBrand.APPLE);
      SystemBlock macSB = new SystemBlock(NameOfBrand.APPLE,macProcessor,macMB,SystemBlockType.HOME,"1TB","32GB");
      Keyboard macKey = new Keyboard(NameOfBrand.APPLE,OutputType.WIRELESS);
      Mouse macMouse = new Mouse(NameOfBrand.APPLE,OutputType.WIRELESS,"Space Grey Magic Mouse 2");

      Computer macPro= new Computer(NameOfBrand.APPLE,"MacPro",macSB,macKey,macMouse,macMonitor,OperatingSystem.MACOS);
      macPro.printInfo();

        System.out.println("-------------------------------------------------------------------");

      Monitor gigMonitor=new Monitor(NameOfBrand.GIGABYTE,TypeOfMonitor.DIGITAL,"2560 x 1440","32-inch");
      CPU gigProcessor= new CPU(NameOfBrand.GIGABYTE,TypeOfProcessor.I7,BitSupport.BIT_64);
      MotherBoard gigMB = new MotherBoard(TypeOfMotherboard.SOMETHING_ELSE,NameOfBrand.GIGABYTE);
      SystemBlock gigSB = new SystemBlock(NameOfBrand.GIGABYTE,gigProcessor,gigMB,SystemBlockType.GAMING,"3TB","16GB");
      Keyboard gigKey = new Keyboard(NameOfBrand.LOGITECH,OutputType.WIRED);
      Mouse gigMouse = new Mouse(NameOfBrand.LOGITECH,OutputType.WIRED,"M500");

      Computer gigabyte = new Computer(NameOfBrand.GIGABYTE,"DIGITAL STORM",gigSB,gigKey,gigMouse,gigMonitor,OperatingSystem.WINDOWS);
      gigabyte.printInfo();




    }
}
