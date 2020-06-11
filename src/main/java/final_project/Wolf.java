package final_project;

public class Wolf extends Carnivores {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wolf(String name) {
        this.name = name;
    }

    public void swim() {
        System.out.println("I can swim");
    }

    public void hunt() {
        System.out.println("I hunt other animals");
    }

    public void fly() {

    }

    public void haveSpine() {

    }

    public void canMove() {
        System.out.println("I can run, but not as fast as a lion!");
    }

    public void breath() {
        System.out.println("I can breath");
    }

    public void eat() {
        System.out.println("I eat other animals");
    }

    public void reproduction() {
        System.out.println("I can reproduce");
    }

    public String forPrint(){
        return name;
    }
}
