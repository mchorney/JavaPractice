package hw13;

public class Processor {
    private int Core;
    private ProcessorManufactor manufactor;

    public int getCore() {
        return Core;
    }

    public void setCore(int core) {
        Core = core;
    }

    public ProcessorManufactor getManufactor() {
        return manufactor;
    }

    public void setManufactor(ProcessorManufactor manufactor) {
        this.manufactor = manufactor;
    }

    public Processor(int core, ProcessorManufactor manufactor) {
        Core = core;
        this.manufactor = manufactor;

    }

    public void printInfo() {
        System.out.println("Core = " + Core + " Manufactor = " + manufactor);
    }
}
