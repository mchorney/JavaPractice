package hw13;

public class Motherboard {
    private Brands brands;
    private MotherboardBrands motherboardType;


    public Motherboard(Brands brands, MotherboardBrands motherboardType) {
        this.brands = brands;
        this.motherboardType = motherboardType;
    }

    public Brands getBrands() {
        return brands;
    }

    public void setBrands(Brands brands) {
        this.brands = brands;
    }

    public MotherboardBrands getMotherboardType() {
        return motherboardType;
    }

    public void setMotherboardType(MotherboardBrands motherboardType) {
        this.motherboardType = motherboardType;
    }


    public void printInfo(){
        System.out.println("Motherboard Brand = " + brands + ", Motherboard Type = " + motherboardType);
    }
}
