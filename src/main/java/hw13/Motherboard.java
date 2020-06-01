package hw13;

public class Motherboard {
    private BrandMotherboard brandMotherboard;
    private double price;

    public Motherboard(BrandMotherboard brandMotherboard, double price) {
        this.brandMotherboard = brandMotherboard;
        this.price = price;
    }

    public BrandMotherboard getBrandMotherboard() {
        return brandMotherboard;
    }

    public void setBrandMotherboard(BrandMotherboard brandMotherboard) {
        this.brandMotherboard = brandMotherboard;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void printInfo(){
        System.out.println("Motherboard brand: "+brandMotherboard.toString()+","+price);
    }
}
