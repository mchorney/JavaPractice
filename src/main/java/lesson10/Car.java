package lesson10;

public class Car {

    // fields:
    public String brand;
    public String model;
    public String color;
    public int year;

    // Методы класса!!!!

    public void honk() {
        System.out.println("Beee-Beeeee");
    }
    public void breaks(){
        System.out.println(brand + " " + model + " Red lights on, car stopped");
    }
    public void carStarted(){
        System.out.println(brand + " " + model + " started");
    }
}
