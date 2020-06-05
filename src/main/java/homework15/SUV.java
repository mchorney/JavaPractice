package homework15;


public class SUV {
    private String make;
    private String model;
    private String color;

    public SUV(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
    public void run(){
        System.out.println(make+" "+model+" is capable to run");
    }
    public String brake(){
        return make+" "+model+" is capable to brake";
    }
}
