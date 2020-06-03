package hw14;

public class Supermarket2 extends Supermarket {
    private String director;
    private Format format;

    public Supermarket2(String name, City city, int openYear, String director, Format format) {
        super(name, city, openYear);
        this.director = director;
        this.format = format;
    }

    @Override
    public String toString() {
        return "Supermarket2{" +
                "director='" + director + '\'' +
                ", format=" + format +
                ", name='" + name + '\'' +
                ", city=" + city +
                ", openYear=" + openYear +
                '}';
    }
}
