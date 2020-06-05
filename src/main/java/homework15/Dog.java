package homework15;

public class Dog implements Pet {
    private String name;
    private int year;

    public Dog(String name, int year) {
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
    public void eat() {
        System.out.println(name+" like meat");
    }

    @Override
    public void sleep() {
        System.out.println(name+" don't like to sleep. Like play outside");
    }

    @Override
    public String voice() {
        return "Gav-Gav";
    }
}
