package hw17;

public class Companion {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Companion(String name) {
        this.name = name;
    }

    public String toString() {
        return "Companion {" +
                "name='" + name + '\'' +
                '}';
    }
}