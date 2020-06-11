package hwFinalProject;

public class BlueWhale extends Carnivores{
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
    public void eatingFlesh() { System.out.println("Kill water creatures to eat"); }

    @Override
    public void warmBloodedMilkFeed() { System.out.println("Milk gets almost injected to baby's mouth"); }

    @Override
    public void haveBackbone() { System.out.println("Have biggest spine bone ever"); }

    @Override
    public void canMove() { System.out.println("Moves under water"); }

    @Override
    public void canBreathe() { System.out.println("I have to poke my nose out ouf water to breathe"); }

    @Override
    public String toString() {
        return "BlueWhale{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
