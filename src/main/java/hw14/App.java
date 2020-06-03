package hw14;

public class App {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(5, true, Brand.MERCEDES);
        Vehicle car = new Car(4, true, Brand.HONDA, 3, "Truck", "Engine");
        Vehicle bicycle = new Bicycle(2, false, Brand.TOYOTA, 0, "Tandem", "Muscles", 2, "Aluminium");
        Plane plane = new Plane(10, false, Brand.CHRYSLER, "Jet", 1);

        v.printOut();
        car.printOut();
        bicycle.printOut();
        plane.printOut();
    }
}
