package hw14;

public class Work {
    public static void main(String[] args) {
        Mechanism mechanism = new Mechanism("Scooter", "Ground");
        WheelMechanism wheelMechanism = new WheelMechanism("Bike", "Ground", 2);
        Car car = new Car("BMW", "Ground", 4, "Diesel");
        Car car1 = new Car("Ferrari", "Track", 4, "Gas-special");
        System.out.println(mechanism.toString());
        System.out.println(wheelMechanism.toString());
        System.out.println(car.toString());
        System.out.println(car1.toString());
        // Actualy function toString is one for all classes
        mechanism.sayHi();
        wheelMechanism.sayHi();
        car.sayHi();
        car1.sayHi();
    }
}