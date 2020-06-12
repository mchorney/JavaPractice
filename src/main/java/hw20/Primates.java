package hw20;

public abstract class Primates implements Mammals {
    protected String name;
    protected String type;

    public Primates(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public abstract String myName();
}

