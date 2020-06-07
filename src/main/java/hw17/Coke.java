package hw17;

public class Coke {
    protected int price;
    protected String taste;

    public Coke(int price, String taste) {
        this.price = price;
        this.taste = taste;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
