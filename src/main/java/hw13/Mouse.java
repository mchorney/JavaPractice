package hw13;

public class Mouse {
    private Brands brands;
    private Price price;
    private MouseType mouseType;


    public Mouse(Brands brands, Price price, MouseType mouseType) {
        this.brands = brands;
        this.price = price;
        this.mouseType = mouseType;
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

    public MouseType getMouseType() {
        return mouseType;
    }

    public void setMouseType(MouseType mouseType) {
        this.mouseType = mouseType;
    }

    public void printInfo(){
        System.out.println("Mouse Brand = " + brands + ", Mouse Price = " + price + ", Mouse Type = " + mouseType);
    }
}
