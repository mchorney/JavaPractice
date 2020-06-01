package hw13;

public class SystemBlock {
    private Processor processor;
    private Memory memory;
    private MotherBoard motherBoard;

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public SystemBlock(Processor processor, Memory memory, MotherBoard motherBoard) {
        this.processor = processor;
        this.memory = memory;
        this.motherBoard = motherBoard;
    }

    public void printInfo() {
        System.out.println("_________________");
        processor.printInfo();
        memory.printInfo();
        motherBoard.printInfo();
    }
}
