package hw20;

public class BlueWhale extends Carnivores {
    private String name;
    private int age;

    public BlueWhale(String name, int age) {
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
        System.out.println("I kill my food in water. ");
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
        System.out.println("I can swim. ");
    }

    @Override
    public void canBreath() {
        System.out.println("I can breath under water. ");
    }

    @Override
    public String toString() {
        return "BlueWhale{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
