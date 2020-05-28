package hw10;

public class City {
    public String name;
    public int population;
    public String location;
    public int amount_of_rainy_days;

    public void printIt() {
        System.out.println("name = " + name);
        System.out.println("population = " + population);
        System.out.println("location = " + location);
        System.out.println("amount_of_rainy_days = " + amount_of_rainy_days);
    }
    public void story(){
        System.out.println("I live in "+name +" with "+population +" number of people.");
    }
}
