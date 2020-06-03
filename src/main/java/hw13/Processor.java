package hw13;

public class Processor {
    private ProcessorBrands processorBrands;
    private Price price;

    public Processor(ProcessorBrands processorBrands, Price price) {
        this.processorBrands = processorBrands;
        this.price = price;
    }

    public ProcessorBrands getProcessorBrands() {
        return processorBrands;
    }

    public void setProcessorBrands(ProcessorBrands processorBrands) {
        this.processorBrands = processorBrands;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String printInfo(){
        return "Processor { Brand = "+ processorBrands +", Price ="+ price +'}';

    }
}
