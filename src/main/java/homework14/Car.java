package homework14;

public class Car {
    protected String make;
    protected String model;
    protected Color color;

    public Car(String make, String model, Color color) {
        this.make = make;
        this.model = model;
        this.color = color;

    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }


    public void printme(){
        System.out.print(make +" " + model + ", color - " + color+" \n");
    }
}
