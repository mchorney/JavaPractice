package hw10;

public class Car {
    public String brand;
    public String model;
    public String type;
    public String color;
    public int year;
    public int mileage;

    public void printIt(){
        System.out.println("brand = "+brand);
        System.out.println("model = "+model);
        System.out.println("type = "+type);
        System.out.println("color = "+color);
        System.out.println("year = "+year);
        System.out.println("mileage = "+mileage);

    }
    public void life(){
        System.out.println("I've bought my "+brand + " "+model+ " two years ago, with a mileage of "+mileage +" miles.");

    }


}
