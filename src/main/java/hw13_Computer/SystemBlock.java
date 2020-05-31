package hw13_Computer;

public class SystemBlock {
    //mother board and cpu fields as other classes
    private NameOfBrand brand;
    private CPU cpu;
    private MotherBoard motherboard;
    private SystemBlockType type;
    private String hardDriveMemory;
    private String operatingMemory;


    public SystemBlock(NameOfBrand brand, CPU cpu, MotherBoard motherboard, SystemBlockType type, String hardDriveMemory, String memory) {
        this.brand = brand;
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.type = type;
        this.hardDriveMemory=hardDriveMemory;
        this.operatingMemory=memory;
    }

    public NameOfBrand getBrand() {
        return brand;
    }

    public void setBrand(NameOfBrand brand) {
        this.brand = brand;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public MotherBoard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(MotherBoard motherboard) {
        this.motherboard = motherboard;
    }

    public SystemBlockType getType() {
        return type;
    }

    public void setType(SystemBlockType type) {
        this.type = type;
    }

    public String getHardDriveMemory() {
        return hardDriveMemory;
    }

    public void setHardDriveMemory(String hardDriveMemory) {
        this.hardDriveMemory = hardDriveMemory;
    }

    public String getMemory() {
        return operatingMemory;
    }

    public void setMemory(String memory) {
        this.operatingMemory = memory;
    }

    public String printInfo(){
        return "\nBrand = "+brand+"\nCPU: "+cpu.printInfo()+"\nMother Board: "+motherboard.printInfo()+"\nSystem Block Type = "+type+
                "\nHard Drive = "+hardDriveMemory+ "\nMemory = "+operatingMemory+"\n";
    }
}
