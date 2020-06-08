package hw17;

public class Supermarkets {
    private String name;
    private int square;

    public Supermarkets(String name, int square) {
        this.name = name;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "Supermarkets{" +
                "name='" + name + '\'' +
                ", square=" + square +
                '}';
    }
}
