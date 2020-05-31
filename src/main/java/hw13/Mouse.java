package hw13;

public class Mouse {
    private MouseBrand mouseBrand;
    private String model;
    private MouseType mouseType;

    public Mouse(MouseBrand mouseBrand, String model, MouseType mouseType) {
        this.mouseBrand = mouseBrand;
        this.model = model;
        this.mouseType = mouseType;
    }

    public MouseBrand getMouseBrand() {
        return mouseBrand;
    }

    public void setBrand(MouseBrand mouseBrand) {
        this.mouseBrand = mouseBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public MouseType getMouseType() {
        return mouseType;
    }

    public void setMouseType(MouseType mouseType) {
        this.mouseType = mouseType;
    }

    public void printInfo() {
        System.out.println("Mouse: brand is " + mouseBrand + ", model is " + model + ", type is " + mouseType);
    }
}
