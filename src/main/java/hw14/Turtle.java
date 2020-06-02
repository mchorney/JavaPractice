package hw14;

public class Turtle extends Animal{
    private int numberOfLegs;
    boolean shell;

    public Turtle(String name, String color, boolean vegetarian, int numberOfLegs, boolean shell) {
        super(name, color, vegetarian);
        this.numberOfLegs = numberOfLegs;
        this.shell = shell;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isShell() {
        return shell;
    }

    public void setShell(boolean shell) {
        this.shell = shell;
    }


    @Override
    public void printAnimal(){
        System.out.println("Turtle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", vegetarian=" + vegetarian + '\'' +
                ", numberOFLegs=" + numberOfLegs + '\'' +
                ", shell='" + shell +
                '}');
    }
}