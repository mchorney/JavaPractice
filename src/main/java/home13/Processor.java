package home13;

public class Processor {
    private String brand;
    private ProcessorTape kind;

    public Processor() {
    }
    public Processor(String brand,ProcessorTape kind){
        this.brand=brand;
        this.kind=kind;
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ProcessorTape getKind() {
        return kind;
    }

    public void setKind(ProcessorTape kind) {
        this.kind = kind;
    }
    public void printInfo(){
        System.out.println("Processor brand is "+brand+"Kind is "+kind);
    }
}