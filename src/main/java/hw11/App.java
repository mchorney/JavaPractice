package hw11;

public class App {

    public static void main(String[] args) {

        Airlincompany newAirlincompany = new Airlincompany(AirlineTipe.ELAL, "ISRAEL");
        System.out.println(newAirlincompany);

        Airplane Boing = new Airplane("Boeing", "Airbus", new Colors[]{Colors.BLUE, Colors.WHITE});
        System.out.println(Boing);

    }
}
