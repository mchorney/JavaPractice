package FoodChain;

public class Wolf extends Carnivores {
    private String name;
    private Color color;

    public Wolf(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
    @Override
    public void mainChar(){
        System.out.println("I am strong and fast and have strong teeth and claws for haunting");
    }

    @Override
    public void hairAndFur(){
        System.out.println("I have a very warm Fur");
    }

    @Override
    public void developedBackbone(){
        System.out.println("I have a well-developed backbone");
    }

    @Override
    public void life(){
        System.out.println("I live in forests!");
    }
}
