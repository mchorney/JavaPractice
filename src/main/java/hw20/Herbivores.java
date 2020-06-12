package hw20;

public abstract class Herbivores implements Mammals {
    protected String name;
    protected String type;

    public Herbivores(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public abstract String myName();
}
