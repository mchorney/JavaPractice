package hw14;

public class Cartoon extends ShowTime {
    private String name;

    public Cartoon(String animeName, boolean kidType, Brand brand, int timeOfShow, String name) {
        super(animeName, kidType, brand, timeOfShow);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printOut(){
        System.out.println("Cartoon show");
    }
}
