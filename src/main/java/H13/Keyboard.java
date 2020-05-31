package H13;

public class Keyboard {
    private String brand;
    private String type;
    private int price;

    public Keyboard(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printInfo(){
        System.out.println("Keyboard: brand =" + brand + ", type =" + type + ", price =" + price);
    }
}
