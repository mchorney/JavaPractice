package hw13_Computer;

public class Mouse {
    private NameOfBrand brand;
    private OutputType mt;
    private String model;

    public Mouse(NameOfBrand brand, OutputType mt, String model) {
        this.brand = brand;
        this.mt = mt;
        this.model = model;
    }

    public NameOfBrand getBrand() {
        return brand;
    }

    public void setBrand(NameOfBrand brand) {
        this.brand = brand;
    }

    public OutputType getMt() {
        return mt;
    }

    public void setMt(OutputType mt) {
        this.mt = mt;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String printInfo(){
        return "Brand = "+brand+" Model = "+model+" Type = "+mt+"\n";
    }
}
