package homework_13;

public class Keyboard {
    private String brand_name;
    private Type type;

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Keyboard(String brand_name, Type type) {
        this.brand_name = brand_name;
        this.type = type;
    }

    public void printInfo(){
        System.out.println("Keyboard. Brand name: "+brand_name+ " Model Type: " +type);
    }
}
