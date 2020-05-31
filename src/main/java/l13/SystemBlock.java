package l13;

public class SystemBlock {

    private Monitor monitor;
    private HD hdd;
    private RAM ram;
    private GraphicsCard videoCard;
    private MotherBoard motherBoard;
    private Processor processor;
    private Mouse mouse;
    private Keyboard keyboard;

    public SystemBlock(Monitor monitor, HD hdd, RAM ram, GraphicsCard videoCard, MotherBoard motherBoard, Processor processor, Mouse mouse, Keyboard keyboard) {
        this.monitor = monitor;
        this.hdd = hdd;
        this.ram = ram;
        this.videoCard = videoCard;
        this.motherBoard = motherBoard;
        this.processor = processor;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public HD getHdd() {
        return hdd;
    }

    public void setHdd(HD hdd) {
        this.hdd = hdd;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public GraphicsCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(GraphicsCard videoCard) {
        this.videoCard = videoCard;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void printInfo() {
        System.out.println("PC components");
        System.out.println(hdd.printInfo());
        System.out.println(ram.printInfo());
        System.out.println(videoCard.printInfo());
        System.out.println(motherBoard.printInfo());
        System.out.println(processor.printInfo());
        System.out.println(mouse.printInfo());
        System.out.println(keyboard.printInfo());

    }
}
