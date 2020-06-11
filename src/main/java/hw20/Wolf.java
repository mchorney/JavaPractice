package hw20;

public class Wolf extends Carnivores {
    private String name;
    private int age;

    public Wolf(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void killForFood() {
        System.out.println("I kill my food. ");
    }

    @Override
    public void milkFeed() {
        System.out.println("My kids drink milk. ");
    }

    @Override
    public void haveSpinalColumn() {
        System.out.println("I have a spine. ");
    }

    @Override
    public void canMove() {
        System.out.println("I can run. ");
    }

    @Override
    public void canBreath() {
        System.out.println("I can breath. ");
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}