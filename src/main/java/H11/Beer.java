package H11;

public class Beer {
    private String brand;
    private String color;
    private int price;

    public Beer(){};

    public Beer(String brand, String color, int price){
        this.brand=brand;
        this.color=color;
        this.price=price;
    }
    public Beer(String brand, int price){
        this.brand=brand;
        this.price=price;
    }
    public Beer(String brand, String color){
        this.brand=brand;
        this.color=color;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void printMe(){
        System.out.println("Brand = " + this.brand + "\nColor =" + this.color +"\nPrice= "+ this.price);
    }

}
