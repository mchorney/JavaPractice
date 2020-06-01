package hw13;

public class Processor {
    private ProcessorBrand processorBrand;
    private double speed;
    private int cacheSize;

    public Processor(ProcessorBrand processorBrand, double speed, int cacheSize) {
        this.processorBrand = processorBrand;
        this.speed = speed;
        this.cacheSize = cacheSize;
    }

    public ProcessorBrand getProcessorBrand() {
        return processorBrand;
    }

    public void setProcessorBrand(ProcessorBrand processorBrand) {
        this.processorBrand = processorBrand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(int cacheSize) {
        this.cacheSize = cacheSize;
    }
    public void printInfo(){
        System.out.println("Brand= "+ processorBrand.toString()+","+"Speed="+ speed+","+"Cache= "+cacheSize);
    }
}
