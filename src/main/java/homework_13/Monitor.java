package homework_13;

public class Monitor {
    private String brand_name;
    private String model;
    private int size;

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Monitor(String brand_name, String model, int size) {
        this.brand_name = brand_name;
        this.model = model;
        this.size = size;
    }

    public void printInfo(){
        System.out.println("Monitor. Brand name: "+brand_name+ " Model Type: " +model+ " Size: " + size+ " inch");
    }
}
