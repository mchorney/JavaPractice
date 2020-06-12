package lesson_10;

public class Car {
    public String brand;
    public String model;
    public String color;
    public int year;

    public void honk(){
        System.out.println("Beee-Beeee");
    }
    public void brakes(){
        System.out.println(brand +" " + model + " Red lights on, car stopped");
    }
    public void carStarted(){
        System.out.println(brand +" " + model + " started");
    }
}
