package homework15;

public class Cat implements Pet {
    private String name;
    private int year;

    public Cat(String name, int year) {
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

    public String voice(){
        return "Mey-Mey";
    }

    @Override
    public void sleep() {
        System.out.println(name+ " like spleep all day long");
    }

    @Override
    public void eat() {
        System.out.println(name+" like fish");
    }
}
