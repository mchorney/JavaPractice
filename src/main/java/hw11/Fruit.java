package hw11;

public class Fruit {
    private String name;
    private String[] color;
    private String taste;

    public Fruit(String name, String[] color, String taste) {
        this.name = name;
        this.color = color;
        this.taste = taste;

    }

    public Fruit() {
    }

    ;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public String[] getColor() {
        return color;
    }

    public String getTaste() {
        return taste;
    }

    public void printOut() {
        System.out.println("Name = " + this.name +"\nTaste = " + this.taste);
        for(String color:this.color){
            System.out.println(color);
        }

    }
}
