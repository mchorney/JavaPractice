package hw14;

public class Game {
    protected String name;
    protected int year;
    protected Type type;
    protected String author;
    protected int numberOfPeople;

    public Game(String name, int year, Type type, int numberOfPeople) {
        this.name = name;
        this.year = year;
        this.type=type;
        this.numberOfPeople = numberOfPeople;
    }

    public Game(String name) {
        this.name = name;
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public Game(String name, int year, Type type, String author, int numberOfPeople) {
        this.name = name;
        this.year = year;
        this.type = type;
        this.author = author;
        this.numberOfPeople = numberOfPeople;
    }

    public void printInfo() {
        System.out.println("Game{" +
                "Name='" + name + '\'' +
                ", Year=" + year +
                ", Type=" + type +
                ", Author='" + author + '\'' +
                ", For number of people=" + numberOfPeople +
                '}');

    }
}
