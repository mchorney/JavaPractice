package finalProjectOOP;

public class Lion extends Carnivores {

    private String name;
    private int age;

    public Lion(String name, int age) {
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
    public void flesh() {
        System.out.println("I eat flesh of my prey.");
    }

    @Override
    public void voice() {
        System.out.println("F--k eeeeee!!!!!");
    }

    @Override
    public void food() {
        System.out.println("You are my food!");
    }

    @Override
    public void evolution() {
        System.out.println("I'm alfy predator.");
    }

    @Override
    public void canBreath() {
        System.out.println("I love Africa's fresh morning air.");

    }
}
