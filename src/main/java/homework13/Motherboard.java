package homework13;

public class Motherboard {
    private Brand motherboardBrand;
    private String size;

    public Motherboard(Brand motherboardBrand, String size) {
        this.motherboardBrand = motherboardBrand;
        this.size = size;
    }

    public Brand getMotherboardBrand() {
        return motherboardBrand;
    }

    public void setMotherboardBrand(Brand motherboardBrand) {
        this.motherboardBrand = motherboardBrand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String printInfo() {
        return "Motherboard{" +
                "motherboardBrand=" + motherboardBrand +
                ", size='" + size + '\'' +
                '}';
    }
}
