package hwFinalProject;

public class Wolf extends Carnivores{
    private String type;
    private int age;


    public Wolf(String type, int age) {
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
    public void eatingFlesh() { System.out.println("Love killing smaller animals"); }

    @Override
    public void warmBloodedMilkFeed() { System.out.println("Baby wolves get fed by mothers milk"); }

    @Override
    public void haveBackbone() { System.out.println("Also have spine"); }

    @Override
    public void canMove() { System.out.println("Love catching rabbits"); }

    @Override
    public void canBreathe() { System.out.println("Will breath until i die"); }

    @Override
    public String toString() {
        return "Wolf{" +
                "type='" + type + '\'' +
                ", age=" + age +
                '}';
    }


}
