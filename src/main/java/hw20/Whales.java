package hw20;

public abstract class Whales implements Mammals {
    protected String name;
    protected String type;

    public Whales(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public abstract String myName();
}