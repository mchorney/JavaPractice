package hwLesson12;

public class SystemBlock {
    private MotherBoard motherboard;
    private Cpu cpu;

    public SystemBlock(MotherBoard motherboard, Cpu cpu) {
        this.motherboard = motherboard;
        this.cpu = cpu;
    }

    public MotherBoard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(MotherBoard motherboard) {
        this.motherboard = motherboard;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public String printOut() {

        return  motherboard.printOut() +cpu.printOut();

    }


}
