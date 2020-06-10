package hw20;

public class BlueWhale extends Carnivores {
    private String name;
    private int year;

    public BlueWhale(String name, int year) {
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
        System.out.println("We kill our food in water. ");
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
                ", year=" + year +
                '}';
    }
}
