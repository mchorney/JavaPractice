package H14;

public class App {
    public static void main(String[] args) {
        Engine engine = new Engine("EcoBust", "V8");
        Drive drive = new Drive("Eco", "Electric", "Front-Wheels-Drive");
        WheelDrive wheelDrive = new WheelDrive("EcoDrive", "Electric", "Front-Wheels-Drive", 2);
        Car streetCar = new Car("EcoDrive", "Electric", "Front-Wheels-Drive", 2, "ZVW30");
        Car suvCar = new Car("Dodge", "Gas-engine", "OffRoad", 4, "HEMI 1500");
        System.out.println(drive.toString());
        System.out.println(wheelDrive.toString());
        System.out.println(streetCar.toString());
        System.out.println(suvCar.toString());

        engine.sayHi();
        suvCar.sayHi();
        }
}
