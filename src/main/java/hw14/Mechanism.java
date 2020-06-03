package hw14;

public class Mechanism {
    protected String name;
    protected String type;

    public Mechanism() {
    }

    public Mechanism(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Mechanism{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public void sayHi(){
        System.out.println("Mechanism say 'Kriak-Kriak'");
    }
}
