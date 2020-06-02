package hw14;

public class Dog extends Animal{
    private int numberOfLegs;

    public Dog(String name, String color, boolean vegetarian, int numberOfLegs) {
        super(name, color, vegetarian);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }


    @Override
    public void printAnimal(){
        System.out.println("Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", vegetarian=" + vegetarian +
                ", numberOFLegs=" + numberOfLegs +
                '}');
    }
}
