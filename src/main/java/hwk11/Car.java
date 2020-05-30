package hwk11;

import java.util.Arrays;

public class Car {
    private String make;
    private String model;
    private int year;
    private String[] previousCars;

    public Car() {
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(String make, String model, int year, String[] cars) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.previousCars = cars;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return year;
    }

    public String[] getPreviousCars() {
        return previousCars;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int num) {
        year = num;
    }

    public void setPreviousCars(String[] cars) {
        previousCars = cars;
    }

    public void printClass() {

        System.out.println("Car make is " + make + "\n" + "Car model is " + model + "\n" + "Car year is " + year + "\n" + "Previous cars I owned are: " );
        printArray(previousCars);
    }

    private void printArray(String[] arr) {
        for (String name : arr) {
            System.out.println(" " + name);
        }
    }

}

