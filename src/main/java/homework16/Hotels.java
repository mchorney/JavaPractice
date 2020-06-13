package homework16;

public class Hotels {
    private String name;

    public Hotels(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hotels{" +
                "name='" + name + '\'' +
                '}';
    }
}
