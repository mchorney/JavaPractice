package FoodChain;

public class BlueWhale extends Carnivores  {
    private String name;
    private double sizeInMeters;

    public BlueWhale(String name, double sizeInMeters) {
        this.name = name;
        this.sizeInMeters = sizeInMeters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSizeInMeters() {
        return sizeInMeters;
    }

    public void setSizeInMeters(double sizeInMeters) {
        this.sizeInMeters = sizeInMeters;
    }

    public void feed(){
        System.out.println("Did you know we feed our babies with milk just like humans do?");
    }
    @Override
    public void mainChar(){
        System.out.println("I am strong and fast and have strong teeth and claws for haunting");
    }

    @Override
    public void hairAndFur(){
        System.out.println("Sounds strange, but I do have some Fur");
    }

    @Override
    public void developedBackbone(){
        System.out.println("I have a well-developed backbone!");
    }

    @Override
    public void life(){
        System.out.println("I have a warm blood even in a cold water");
    }

    @Override
    public String toString() {
        return "BlueWhale{" +
                "name='" + name + '\'' +
                ", sizeInMeters=" + sizeInMeters +
                '}';
    }
}
