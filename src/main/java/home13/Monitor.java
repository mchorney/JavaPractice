package home13;

public class Monitor {
    private String brand;
    private MonitorTape type;
    private int size;

    public Monitor() {
    }
    public Monitor(String brand,MonitorTape type,int size){
        this.brand=brand;
        this.type=type;
        this.size=size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public MonitorTape getType() {
        return type;
    }

    public void setType(MonitorTape type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void printInfo(){
        System.out.println("Monitor brand: "+brand+"Tape is "+type+"Size is "+size);
    }
}
