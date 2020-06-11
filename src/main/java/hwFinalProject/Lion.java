package hwFinalProject;

public class Lion extends Carnivores{
    private String type;
    private int age;


    public Lion(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void eatingFlesh() {
        System.out.println("I love eating freshly killed meat");
    }

    @Override
    public void warmBloodedMilkFeed() { System.out.println("Young lions drink mother milk"); }

    @Override
    public void haveBackbone() {
        System.out.println("Have strong spine");
    }

    @Override
    public void canMove() {
        System.out.println("Moving so quickly");
    }

    @Override
    public void canBreathe() { System.out.println("I'm glad i can breathe"); }

    @Override
    public String toString() {
        return "Lion{" +
                "type='" + type + '\'' +
                ", age=" + age +
                '}';
    }


}
