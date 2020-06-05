package homework15;


public class App {
    public static void main(String[] args) {
        SUV lexus=new SUV("Lexus", "RX350L", "silver");
        Truck volvo=new Truck("Volvo", "VNL 780", "white");

        lexus.run();
        String brake = lexus.brake();
        System.out.println(brake);
        volvo.run();
        String brake1=volvo.brake();
        String transportation=volvo.transportation();
        System.out.println(brake1);
        System.out.println(transportation);

    }
}
