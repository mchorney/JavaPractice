package home13;

public class Keyboard {
    private String brand;
    private KeyboardTape kinds;
    private Color color;

    public Keyboard() {
    }
    public Keyboard(String brand,KeyboardTape kinds,Color color){
        this.brand=brand;
        this.kinds=kinds;
        this.color=color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public KeyboardTape getKinds() {
        return kinds;
    }

    public void setKinds(KeyboardTape kinds) {
        this.kinds = kinds;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void printInfo(){
        System.out.println("Keyboard brand: "+brand+"Kinds is "+kinds+"Color is "+color);
    }
}
