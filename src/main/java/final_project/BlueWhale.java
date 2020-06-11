package final_project;

public class BlueWhale extends Carnivores {
    private String name;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public BlueWhale(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void swim() {
        System.out.println("I can swim like a fish! Big fish!");
    }

    public void hunt() {
        System.out.println("I am herbivore!");
    }

    public void fly() {

    }

    public void haveSpine() {

    }

    public void canMove() {
        System.out.println("I can swim!!");
    }

    public void breath() {
        System.out.println("I can breathe under water!");
    }

    public void eat() {
        System.out.println("I eat");
    }

    public void reproduction() {
        System.out.println("I can reproduce (I dont lay eggs!)");
    }

    public String forPrint(){
        return name + " Weight = " + weight;
    }
}
