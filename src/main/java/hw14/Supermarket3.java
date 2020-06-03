package hw14;

public class Supermarket3 extends Supermarket2 {
    protected Schedule[] schedule;

    public Supermarket3(String name, City city, int openYear, String director, Format format, Schedule[] schedule) {
        super(name, city, openYear, director, format);
        this.schedule = schedule;
    }
}
