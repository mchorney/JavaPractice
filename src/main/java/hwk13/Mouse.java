package hwk13;

public class Mouse{
    private MouseType type;
    private Brand brand;

    public Mouse(MouseType type, Brand brand) {
        this.type = type;
        this.brand = brand;
    }

    public MouseType getType() {
        return type;
    }

    public Brand getBrand() {
        return brand;
    }

    public void printInfo() {
        System.out.println("Mouse{" +
                "type=" + type.name() +
                ", brand=" + brand.name() +
                '}');
    }
}
