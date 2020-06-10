package l16_17;

public class App2 {
    public static void main(String[] args) {
        Car mazda = new Car("Mazda", "CX9",2019);

        Car honda = new Car("Honda", "Civic",2019);

        Car toyota = new Car("Toyota", "Camry",2019);

        Car.xx="CCCC";
        Car.about();

        System.out.println(Car.count);
    }
}
