package hw17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {


        HashMap<String, String> cars = new HashMap<String, String>();
        cars.put("Honda", "Accord");
        cars.put("Toyota", "Camry");
        cars.put("Nissan", "Altima");
        cars.put("Subaru", "Impreza");

        System.out.println(cars.get("Honda"));

        Set keyset = cars.keySet();
        System.out.println("Key set values are: " + keyset);

        cars.remove("Subaru");

        System.out.println(cars);

        cars.keySet();


        for(Map.Entry b : cars.entrySet()) {
            System.out.println(b.getKey() + " " + b.getValue());

            Map<Integer, String> parking = new HashMap<>();
            parking.put(0, "Honda");
            parking.put(1, "Toyota");
            parking.put(2, "Nissan");
            parking.put(3, "Subaru");

            for (Map.Entry<Integer, String> entry : parking.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());

            }

            for (String v : parking.values()) {
                System.out.println(v);
            }

            for (Integer k : parking.keySet()) {
                System.out.println(k);
            }

            parking.remove(2);

            System.out.println(parking.get(3));

            Map<Cars, ParkingLot> Map = new HashMap<>();
            ParkingLot Orange = new ParkingLot("Orange", 5);
            ParkingLot Blue = new ParkingLot("Blue", 8);
            Cars Honda = new Cars("Honda", "Accord");
            Cars Subaru = new Cars("Subaru", "Impreza");

            Map.put(Honda, Orange);
            Map.put(Subaru, Blue);

            Orange.printInfo();

            Orange.setRow(2);
            Subaru.setModel("Impreza");
            System.out.println(Map.get(Honda));
            System.out.println(Map.get(Subaru));

            Map.remove(Honda);

            System.out.println(Map);
        }


    }
}
