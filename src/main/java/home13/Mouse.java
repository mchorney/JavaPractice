package home13;

public class Mouse {
    private MouseTape kinds;
    private String brand;
    private Color color;

    public Mouse() {
    }
    public Mouse(MouseTape kinds, String brand, Color color){
        this.kinds=kinds;
        this.brand=brand;
        this.color=color;
    }

    public MouseTape getKinds() {
        return kinds;
    }

    public void setKinds(MouseTape kinds) {
        this.kinds = kinds;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void printInfo(){
        System.out.println("Mouse model is "+kinds+" Brand is "+brand+" Color is "+color);
    }

}
