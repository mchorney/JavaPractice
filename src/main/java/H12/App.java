package H12;

public class App {
    public static void main(String[] args) {
        Car kia = new Car("Kia", CarModel.SPORTAGE, "BLACK");
        System.out.println(kia);

        Suits armaniStreet = new Suits("Armani", "Street", new Colors[]{Colors.BLACK, Colors.BLUE, Colors.RED, Colors.WHITE});
        System.out.println(armaniStreet);
    }
}
