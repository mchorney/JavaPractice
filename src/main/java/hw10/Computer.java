package hw10;

public class Computer {
    public String brand;
    public String os;
    public int year;
    public int price;

    public void turnOn() {
        System.out.println("Hello, welcome to " + os + " computer, please enter your password");
    }

    public void update() {
        System.out.println("Hello, you have new updates for " + os + ", please install and restart computer");
    }

    public void turnOff() {
        System.out.println("Please close all you programs before turn off your " + os + " computer");
    }
}
