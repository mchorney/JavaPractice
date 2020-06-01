package homework13;

public class Processor {
    private Brand processorBrand;
    private int numberOfCores;
    private double frequency;

    public Processor(Brand processorBrand, int numberOfCores, double frequency) {
        this.processorBrand = processorBrand;
        this.numberOfCores = numberOfCores;
        this.frequency = frequency;
    }

    public Brand getProcessorBrand() {
        return processorBrand;
    }

    public void setProcessorBrand(Brand processorBrand) {
        this.processorBrand = processorBrand;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }


    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }


    public String PrintInfo() {
        return "Processor{" +
                "processorBrand=" + processorBrand +
                ", numberOfCores=" + numberOfCores +
                ", frequency=" + frequency +
                '}';
    }
}
