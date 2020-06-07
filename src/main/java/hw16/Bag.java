package hw16;

public class Bag {

    private String color;
    private String fabric;
    private int price;
    private String type;

    public Bag(String color, String fabric, int price, String type) {
        this.color = color;
        this.fabric = fabric;
        this.price = price;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
