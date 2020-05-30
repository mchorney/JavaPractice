package homework11;

public class Restaurants {
    private String name;
    private String hours;
    private String cousine;

    public Restaurants() {}

    public Restaurants(String n, String h, String c) {
        name=n;
        hours=h;
        cousine=c;
    }

    public String getCousine() {
        return cousine;
    }

    public String getHours() {
        return hours;
    }

    public String getName() {
        return name;
    }

    public void setCousine(String cousine) {
        this.cousine = cousine;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printClass() {
        System.out.println("Hello, Our restaurant " + name + " serve " + cousine + " cousine " + "and has working hours " + hours);
    }
}