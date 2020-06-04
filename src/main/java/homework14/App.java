package homework14;

public class App {
    public static void main(String[] args) {
        SUV lexus=new SUV("Lexus", "RX350L", Color.SILVER, "good for traveling", "comfort and beauty");
        Compact honda =new Compact("Honda", "Civic Si",Color.BLACK, "very fast");
        Truck volvo=new Truck ("Volvo", "VNL 780", Color.WHITE, "freight transportation","40000 pounds");
        honda.printme();
        lexus.printme();
        volvo.printme();
    }
}
