package hw13;

public class SystemBlock {
    private String  name;
    private String  processor;
    private String  motherboard;
    private String gpu;

    public SystemBlock(String name, String processor, String motherboard, String gpu) {
        this.name = name;
        this.processor = processor;
        this.motherboard = motherboard;
        this.gpu = gpu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void printOut() {
        System.out.println("System block "+name+ " include: Motherboard " +motherboard+ ", processor " +processor+ " and GPU " +gpu+",");
    }
}
