package hw20;

public abstract class Seals implements Mammals {
    protected String name;
    protected String type;

    public Seals(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public abstract String myName();
}
