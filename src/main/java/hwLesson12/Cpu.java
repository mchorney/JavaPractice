package hwLesson12;

public class Cpu {
    private CpuBrand cpubrand;
    private CpuModel cpumodel;

    public Cpu(CpuBrand cpubrand, CpuModel cpumodel) {
        this.cpubrand = cpubrand;
        this.cpumodel = cpumodel;
    }

    public CpuBrand getCpubrand() {
        return cpubrand;
    }

    public void setCpubrand(CpuBrand cpubrand) {
        this.cpubrand = cpubrand;
    }

    public CpuModel getCpumodel() {
        return cpumodel;
    }

    public void setCpumodel(CpuModel cpumodel) {
        this.cpumodel = cpumodel;
    }


    public String printOut() {
        return "Cpu{" +
                "cpubrand=" + cpubrand +
                ", cpumodel=" + cpumodel +
                '}';
    }
}
