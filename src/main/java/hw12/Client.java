package hw12;

public class Client {

    private String name;
    private int level;
    private Gyms gyms;

    public Client(String name, int level, Gyms gyms) {
        this.name = name;
        this.level = level;
        this.gyms = gyms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Gyms getGyms() {
        return gyms;
    }

    public void setGyms(Gyms gyms) {
        this.gyms = gyms;
    }

    public void printOut() {
        System.out.println("Client " + name + " at  " + gyms + " with level " + level+" will have session with:");
    }
}


