package hw17;

public class City {
    private String state;
    private String name;

    public City(String state, String name) {
        this.state = state;
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "state='" + state + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
