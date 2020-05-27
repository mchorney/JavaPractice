package I10_1;

public class Car {
    public String brand;
    public String model;
    public String color;
    public int year;

    public void honk() {
        System.out.println("Beee-Beee");
    }

    public void brakes(){
        System.out.println("Red Lights on, car stopped");
    }
    public void carStarted(){
        System.out.println(brand +"" +model +"started");
}
}

