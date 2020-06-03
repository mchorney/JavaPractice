package hw13;

public class Keybord {
    private Brands brands;
    private Price price;
    private KeyboardType keyboardType;

    public Keybord(Brands brands, Price price, KeyboardType keyboardType) {
        this.brands = brands;
        this.price = price;
        this.keyboardType = keyboardType;
    }

    public Brands getBrands() {
        return brands;
    }

    public void setBrands(Brands brands) {
        this.brands = brands;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public KeyboardType getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(KeyboardType keyboardType) {
        this.keyboardType = keyboardType;
    }

    public String printInfo(){
        return "Keyboard {Brand = " + brands + ", Price = " + price + ", Type = " + keyboardType+ '}';
    }
}
