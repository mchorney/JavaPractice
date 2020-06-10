package hw20;

public class Lion extends Carnivores{
    private String name;
    private int year;

    public Lion(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
    public void isChordates() {
        System.out.println("I have spine. ");
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
        return "Lion{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
