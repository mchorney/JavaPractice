package hw11;

public class T_shirt {
    private String[] color;
    private String model;
    private char[] size;

    public T_shirt(){}

    public T_shirt(String[] color,String model, char[] size){
        this.color=color;
        this.model=model;
        this.size=size;
    }

    public String[] getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public char[] getSize() { return size; }


    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String[] color) { this.color = color; }

    public void setSize(char[] size) { this.size = size; }

    public void printOut(){
        System.out.println("We have " + model + " T-shirts with following color and size: ");
    }


}
