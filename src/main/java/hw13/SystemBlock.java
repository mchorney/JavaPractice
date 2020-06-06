package hw13;

public class SystemBlock {
    private String  name;
    private Processor processor;
    private Motherboard motherboard;
    private GPU gpu;
    private RAM ram;

    public SystemBlock(String name, Processor processor, Motherboard motherboard, GPU gpu, RAM ram) {
        this.name = name;
        this.processor = processor;
        this.motherboard = motherboard;
        this.gpu = gpu;
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void printOut() {
        System.out.println ("System block "+name+ " include: Motherboard " +motherboard+ ", " +processor.printOut()+ ", GPU " +gpu+" and "+ram.printOut()+" ");
    }
}
